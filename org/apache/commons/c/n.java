/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import org.apache.commons.c.ao;

public class n {
    public static String a(Class class_, String string) {
        ao.a((Object)class_, "Parameter '%s' must not be null!", "context");
        ao.a((Object)string, "Parameter '%s' must not be null!", "resourceName");
        return n.a(class_.getPackage(), string);
    }

    public static String a(Package package_, String string) {
        ao.a((Object)package_, "Parameter '%s' must not be null!", "context");
        ao.a((Object)string, "Parameter '%s' must not be null!", "resourceName");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(package_.getName());
        stringBuilder.append(".");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String b(Class class_, String string) {
        ao.a((Object)class_, "Parameter '%s' must not be null!", "context");
        ao.a((Object)string, "Parameter '%s' must not be null!", "resourceName");
        return n.b(class_.getPackage(), string);
    }

    public static String b(Package package_, String string) {
        ao.a((Object)package_, "Parameter '%s' must not be null!", "context");
        ao.a((Object)string, "Parameter '%s' must not be null!", "resourceName");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(package_.getName().replace('.', '/'));
        stringBuilder.append("/");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

