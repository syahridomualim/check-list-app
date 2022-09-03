package com.syahrido.mualim.example.checklistapp.model.response

data class EmployeeResponse(
    val idEmployee: Long,
    val name: String,
    val email: String,
    val profileImageUrl: String?,
    val activeDate: Long?,
    val role: String?,
    val authorities: Array<out String>?,
    val lastLoginDate: Long?,
    val lastLoginDisplayDate: Long?,
    val isActive: Boolean,
    val isNotLocked: Boolean,
//    val area: Area?,
//    val department: Department?
)