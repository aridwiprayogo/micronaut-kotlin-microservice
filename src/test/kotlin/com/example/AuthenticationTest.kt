package com.example

import com.example.client.AuthClient
import com.nimbusds.jwt.JWTParser
import com.nimbusds.jwt.SignedJWT
import io.micronaut.security.authentication.UsernamePasswordCredentials
import io.micronaut.security.token.jwt.render.BearerAccessRefreshToken
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.text.ParseException
import javax.inject.Inject

@MicronautTest
class AuthenticationTest {

    @Inject
    lateinit var client: AuthClient

    @Test
    @Throws(ParseException::class)
    fun testAuthenticationGivenUsernameAndPassword(){
        val credentials = UsernamePasswordCredentials("tes@mail.com", "123123")
        val response: BearerAccessRefreshToken = client.login(credentials)

        assertThat(response.username).isEqualTo("tes@mail.com")
        assertThat(response.accessToken).isNotNull
        assertThat(JWTParser.parse(response.accessToken)).isInstanceOf(SignedJWT::class.java)
    }
}
