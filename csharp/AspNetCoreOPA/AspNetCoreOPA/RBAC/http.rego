package httpapi.rbac

import input

default allow = false

allow {
    input.method = "GET"
    input.path = ["todo", username, _]
    input.user = username
}