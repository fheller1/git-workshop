package com.iteratec.gitworkshop.repository

import com.iteratec.gitworkshop.data.CommandDescription
import org.springframework.stereotype.Repository

@Repository
class GitInfoRepo {

<<<<<<< HEAD
    val endpointList: List<String> = listOf("gitCommitAmend", "gitRebase", "gitCherry-Pick");
=======
    val endpointList: List<String> = listOf("gitCommitAmend", "gitCherry-Pick")
>>>>>>> 7149b7a ([bugfix] remove warnings)

    fun getInfoAmend(): CommandDescription {
        return CommandDescription(
                "Git Commit Amend",
                "git commit --amend",
                "Allows the user to modify the last committed commit."
        )
    }

    fun getInfoRebase(): CommandDescription
    {
        return CommandDescription(
            "Git Rebase",
            "git rebase <onto-branch>",
            "Allows the user to cherry-pick all commits of the current branch to the commits of the onto-branch."
        );
    fun getInfoCherryPick(): CommandDescription {
        return CommandDescription(
                "Git Cherry-Pick",
                "git cherry-pick [hash]",
                "Given one or more existing commits, apply the change each one introduces, recording a new commit for each."
        )
    }
}