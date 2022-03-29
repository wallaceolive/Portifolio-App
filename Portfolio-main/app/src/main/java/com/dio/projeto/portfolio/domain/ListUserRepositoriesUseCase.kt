package com.dio.projeto.portfolio.domain

import com.dio.projeto.portfolio.core.UseCase
import com.dio.projeto.portfolio.data.model.Repo
import com.dio.projeto.portfolio.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}