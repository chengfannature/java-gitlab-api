package org.gitlab.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Commit with stats, which describe the additions and deletions of a commit.
 */
public class GitlabCommitWithStats extends GitlabCommit {

    public static final String URL = "with_stats";
    @JsonProperty("stats")
    private GitlabCommitStats gitlabCommitStats;

    public GitlabCommitStats getGitlabCommitStats() {
        return gitlabCommitStats;
    }

    public void setGitlabCommitStats(GitlabCommitStats gitlabCommitStats) {
        this.gitlabCommitStats = gitlabCommitStats;
    }
}
