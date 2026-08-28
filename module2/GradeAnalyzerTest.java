import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeAnalyzerTest {

    @Test
    void calculateAverage_returnsZero_whileInputIsEmpty() {

    // Arrange
    ArrayList<Integer> scores = new ArrayList<>();

    // Act
    double result = GradeAnalyzer.calculateAverage(scores);

    // Assert
    assertEquals(0.0, result);
    }

    @Test
    void calculateAverage_returnsCorrectAverage_forTypicalScores() {

    // Arrange
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(90, 80, 70, 60, 50));

    // Act
    double result = GradeAnalyzer.calculateAverage(scores);

    // Assert
    assertEquals(70.0, result);
    }

    @Test
    void calculateAverage_returnsDouble_notInteger() {

    // Arrange
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(45,66));

    // Act
    double result = GradeAnalyzer.calculateAverage(scores);

    // Assert
    assertEquals(55.5, result);
    }

    @Test
    void calculateAverage_handlesAllSameValues() {

    // Arrange
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(84, 84, 84, 84));

    // Act
    double result = GradeAnalyzer.calculateAverage(scores);

    // Assert
    assertEquals(84.0, result);
    }

    @Test
    void calculateAverage_returnsSingleValue_whenListHasOneItem() {

    // Arrange
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(56));

    // Act
    double result = GradeAnalyzer.calculateAverage(scores);

    // Assert
    assertEquals(56.0, result);
    }

    @Test
    void calculateAverage_returnsSingleValue_whenListHasTenItem() {

    // Arrange
    ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(45, 12, 20, 95, 100, 56, 78, 90, 34, 23));

    // Act
    double result = GradeAnalyzer.calculateAverage(scores);

    // Assert
    assertEquals(55.3, result);
    }

}
