## How I Am Learning Git

I am learning Git by practicing the basic workflow for tracking and sharing project changes. First, I use `git status` to see what has changed. I review my work with `git diff`, then use `git add <file>` to stage specific files or `git add .` to stage everything I want to include.

Next, I use `git commit -m "message"` to save a snapshot with a clear description. I use `git log` or `git log --oneline` to review the project history, and `git push` to send my commits to GitHub. Before starting new work, I use `git pull` to get the latest changes from GitHub.

For organized development, I use `git checkout -b <name>` to create a feature branch, `git branch` to see available branches, and `git checkout main` to return to the main branch. When the feature is complete, I use `git merge <branch>` to combine it with the current branch. I use `git clone <url>` when I need to copy a repository from GitHub for the first time.

### My Git Routine

1. Pull the latest project changes.
2. Create or switch to a branch for my work.
3. Edit and test the files.
4. Check the changes with `git status` and `git diff`.
5. Stage the correct files.
6. Commit with a meaningful message.
7. Push the branch to GitHub.
