package com.example.client

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client
import io.micronaut.security.authentication.UsernamePasswordCredentials
import io.micronaut.security.token.jwt.render.BearerAccessRefreshToken

@Client("/")
interface AuthClient {
    @Post("/auth/login")
    fun login(@Body credentials: UsernamePasswordCredentials): BearerAccessRefreshToken
}
