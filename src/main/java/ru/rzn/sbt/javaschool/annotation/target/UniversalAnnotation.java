package ru.rzn.sbt.javaschool.annotation.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * If a Target meta-annotation is not present on an annotation type declaration,
 * the declared type may be used on any program element.
 *
 * If no Retention annotation is present on an annotation type declaration,
 * the retention policy defaults to RetentionPolicy.CLASS.
 */
public @interface UniversalAnnotation {
}
