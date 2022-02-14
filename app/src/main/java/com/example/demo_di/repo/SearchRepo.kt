package com.example.demo_di.repo

import com.example.demo_di.network.GithubServiceAPI
import com.example.demo_di.ultis.Result

class SearchRepo(val githubServiceAPI: GithubServiceAPI) {
    suspend fun getSearchResult(name: String): Result {
        var result: Result
        try {
            result = Result.success(githubServiceAPI.getUserInfo(name))
        } catch (e: Exception) {
            result = Result.error(e.message)
        }
        return result
    }
}