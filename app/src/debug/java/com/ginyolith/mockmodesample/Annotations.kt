package com.ginyolith.mockmodesample

import javax.inject.Qualifier

@Qualifier
@Target(AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION)
annotation class IsMockMode

@Qualifier
@Target(AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FUNCTION)
annotation class DebugInstance
