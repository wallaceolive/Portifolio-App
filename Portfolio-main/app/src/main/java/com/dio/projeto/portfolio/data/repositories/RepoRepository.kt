package com.dio.projeto.portfolio.data.repositories

import com.dio.projeto.portfolio.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}