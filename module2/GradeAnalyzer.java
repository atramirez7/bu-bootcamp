import java.io.*;
import java.util.ArrayList;

public class GradeAnalyzer {
    private static int invalidLinesSkipped;

    public static void main(String[] args) {
        String inputFile = args.length > 0 ? args[0] : "scores.txt";
        String outputFile = args.length > 1 ? args[1] : "report.txt";
        ArrayList<Integer> scores = readScores(inputFile);
        double average = calculateAverage(scores);
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (int score : scores) {
            high = Math.max(high, score);
            low = Math.min(low, score);

            if (score >= 90) {
                countA++;
            } else if (score >= 80) {
                countB++;
            } else if (score >= 70) {
                countC++;
            } else if (score >= 60) {
                countD++;
            } else {
                countF++;
            }
        }

        if (scores.isEmpty()) {
            high = 0;
            low = 0;
            System.out.println("No scores to analyze.");
        }

        writeReport(scores, average, high, low, outputFile);
    }

    // Returns a list of valid scores read from the file
    public static ArrayList<Integer> readScores(String filename) {
        ArrayList<Integer> scores = new ArrayList<>();
        invalidLinesSkipped = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String trimmedLine = line.trim();
                if (trimmedLine.isEmpty()) {
                    invalidLinesSkipped++;
                    continue;
                }

                try {
                    scores.add(Integer.parseInt(trimmedLine));
                } catch (NumberFormatException e) {
                    invalidLinesSkipped++;
                    System.out.println("Warning: skipping invalid score: '" + line + "'");
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }

        return scores;
    }

    // Returns the average of a list of scores, or 0.0 if the list is empty
    public static double calculateAverage(ArrayList<Integer> scores) {
        if (scores.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.size();
    }

    // Writes and prints the report
    public static void writeReport(ArrayList<Integer> scores,
                                   double avg, int high, int low,
                                   String outputFile) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        for (int score : scores) {
            if (score >= 90) {
                countA++;
            } else if (score >= 80) {
                countB++;
            } else if (score >= 70) {
                countC++;
            } else if (score >= 60) {
                countD++;
            } else {
                countF++;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String[] reportLines = {
                "=== Grade Analysis Report ===",
                String.format("%-25s %5d", "Total scores processed:", scores.size()),
                String.format("%-25s %5d", "Invalid lines skipped:", invalidLinesSkipped),
                "",
                String.format("%-18s %8.2f", "Average score:", avg),
                String.format("%-18s %8d", "Highest score:", high),
                String.format("%-18s %8d", "Lowest score:", low),
                "",
                "Grade distribution:",
                String.format("  %-16s %3d", "A (90-100):", countA),
                String.format("  %-16s %3d", "B (80-89):", countB),
                String.format("  %-16s %3d", "C (70-79):", countC),
                String.format("  %-16s %3d", "D (60-69):", countD),
                String.format("  %-16s %3d", "F (below 60):", countF)
            };

            for (String line : reportLines) {
                writer.write(line);
                writer.newLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Could not write file: " + e.getMessage());
        }
    }
}
