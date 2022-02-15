// To parse the JSON, install kotlin's serialization plugin and do:
//
// val json         = Json(JsonConfiguration.Stable)
// val temperatures = json.parse(Temperatures.serializer(), jsonString)

package com.example.demo_di.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(
    val login: String? = null,
    val id: Long? = null,

    @SerializedName("node_id")
    val nodeID: String? = null,

    @SerializedName("avatar_url")
    val avatarURL: String? = null,

    @SerializedName("gravatar_id")
    val gravatarID: String? = null,

    val url: String? = null,

    @SerializedName("html_url")
    val htmlURL: String? = null,

    @SerializedName("followers_url")
    val followersURL: String? = null,

    @SerializedName("following_url")
    val followingURL: String? = null,

    @SerializedName("gists_url")
    val gistsURL: String? = null,

    @SerializedName("starred_url")
    val starredURL: String? = null,

    @SerializedName("subscriptions_url")
    val subscriptionsURL: String? = null,

    @SerializedName("organizations_url")
    val organizationsURL: String? = null,

    @SerializedName("repos_url")
    val reposURL: String? = null,

    @SerializedName("events_url")
    val eventsURL: String? = null,

    @SerializedName("received_events_url")
    val receivedEventsURL: String? = null,

    val type: String? = null,

    @SerializedName("site_admin")
    val siteAdmin: Boolean? = null,

    val name: String? = null,
    val company: String? = null,
    val blog: String? = null,
    val location: String? = null,
    val email: String? = null,
    val hireable: String? = null,
    val bio: String? = null,

    @SerializedName("twitter_username")
    val twitterUsername: String? = null,

    @SerializedName("public_repos")
    val publicRepos: Long? = null,

    @SerializedName("public_gists")
    val publicGists: Long? = null,

    val followers: Long? = null,
    val following: Long? = null,

    @SerializedName("created_at")
    val createdAt: String? = null,

    @SerializedName("updated_at")
    val updatedAt: String? = null
) :Serializable{
    class Builder {
        var login: String? = null
        var id: Long? = null
        var nodeID: String? = null
        var avatarURL: String? = null
        var gravatarID: String? = null
        var url: String? = null
        var htmlURL: String? = null
        var followersURL: String? = null
        var followingURL: String? = null
        var gistsURL: String? = null
        var starredURL: String? = null
        var subscriptionsURL: String? = null
        var organizationsURL: String? = null
        var reposURL: String? = null
        var eventsURL: String? = null
        var receivedEventsURL: String? = null
        var type: String? = null
        var siteAdmin: Boolean? = null
        var name: String? = null
        var company: String? = null
        var blog: String? = null
        var location: String? = null
        var email: String? = null
        var hireable: String? = null
        var bio: String? = null
        var twitterUsername: String? = null
        var publicRepos: Long? = null
        var publicGists: Long? = null
        var followers: Long? = null
        var following: Long? = null
        var createdAt: String? = null
        var updatedAt: String? = null


        @JvmName("setLogin1")
        fun setLogin(value: String?): Builder {
            login = value
            return this
        }


        fun setID(value: Long): Builder {
            id = value
            return this
        }


        @JvmName("setNodeID1")
        fun setNodeID(value: String?): Builder {
            nodeID = value
            return this

        }


        @JvmName("setAvatarURL1")
        fun setAvatarURL(value: String?): Builder {
            avatarURL = value
            return this
        }


        @JvmName("setGravatarID1")
        fun setGravatarID(value: String?): Builder {
            gravatarID = value
            return this

        }


        fun setURL(value: String?): Builder {
            url = value
            return this
        }


        fun setHTMLURL(value: String?): Builder {
            htmlURL = value
            return this
        }


        @JvmName("setFollowersURL1")
        fun setFollowersURL(value: String?): Builder {
            followersURL = value
            return this
        }


        @JvmName("setFollowingURL1")
        fun setFollowingURL(value: String?): Builder {
            followingURL = value
            return this
        }


        @JvmName("setGistsURL1")
        fun setGistsURL(value: String?): Builder {
            gistsURL = value
            return this
        }


        @JvmName("setStarredURL1")
        fun setStarredURL(value: String?): Builder {
            starredURL = value
            return this
        }


        @JvmName("setSubscriptionsURL1")
        fun setSubscriptionsURL(value: String?): Builder {
            subscriptionsURL = value
            return this
        }


        @JvmName("setOrganizationsURL1")
        fun setOrganizationsURL(value: String?): Builder {
            organizationsURL = value
            return this
        }


        @JvmName("setReposURL1")
        fun setReposURL(value: String?): Builder {
            reposURL = value
            return this
        }


        @JvmName("setEventsURL1")
        fun setEventsURL(value: String?): Builder {
            eventsURL = value
            return this
        }

        @JvmName("getReceivedEventsURL1")


        fun setReceivedEventsURL(value: String?): Builder {
            receivedEventsURL = value
            return this
        }


        @JvmName("setType1")
        fun setType(value: String?): Builder {
            type = value
            return this
        }


        fun setSiteAdmin(value: Boolean): Builder {
            siteAdmin = value
            return this
        }


        @JvmName("setName1")
        fun setName(value: String?): Builder {
            name = value
            return this
        }


        @JvmName("setCompany1")
        fun setCompany(value: String?): Builder {
            company = value
            return this
        }


        @JvmName("setBlog1")
        fun setBlog(value: String?): Builder {
            blog = value
            return this
        }


        @JvmName("setLocation1")
        fun setLocation(value: String?): Builder {
            location = value
            return this
        }


        @JvmName("setEmail1")
        fun setEmail(value: String?): Builder {
            email = value
            return this
        }


        @JvmName("setHireable1")
        fun setHireable(value: String?): Builder {
            hireable = value
            return this
        }


        @JvmName("setBio1")
        fun setBio(value: String?): Builder {
            bio = value
            return this
        }


        @JvmName("setTwitterUsername1")
        fun setTwitterUsername(value: String?): Builder {
            twitterUsername = value
            return this
        }


        fun setPublicRepos(value: Long?): Builder {
            publicRepos = value
            return this
        }


        fun setPublicGists(value: Long?): Builder {
            publicGists = value
            return this
        }


        fun setFollowers(value: Long?): Builder {
            followers = value
            return this
        }


        @JvmName("setFollowing1")
        fun setFollowing(value: Long?): Builder {
            following = value
            return this
        }


        @JvmName("setCreatedAt1")
        fun setCreatedAt(value: String?): Builder {
            createdAt = value
            return this
        }

        fun create(): User {
            return User(
                login,
                id,
                nodeID,
                avatarURL,
                gravatarID,
                url,
                htmlURL,
                followersURL,
                followingURL,
                gistsURL,
                starredURL,
                subscriptionsURL,
                organizationsURL,
                reposURL,
                eventsURL,
                receivedEventsURL,
                type,
                siteAdmin,
                name,
                company,
                blog,
                location,
                email,
                hireable,
                bio,
                twitterUsername,
                publicRepos,
                publicGists,
                followers,
                following,
                createdAt,
                updatedAt
            )
        }

    }

}
