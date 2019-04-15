package org.gitlab.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describe the stats of a commit, including additions and deletions of
 * the commit.
 */
public class GitlabCommitStats {


    @JsonProperty("additions")
    private int additions;
    @JsonProperty("deletions")
    private int deletions;
    @JsonProperty("total")
    private int total;

    public int getAdditions() {
        return additions;
    }

    public void setAdditions(int additions) {
        this.additions = additions;
    }

    public int getDeletions() {
        return deletions;
    }

    public void setDeletions(int deletions) {
        this.deletions = deletions;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
