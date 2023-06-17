/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import org.apache.logging.log4j.core.d.v;

public class n {
    public static int a(String string, int n2) {
        return v.a(string) ? n2 : Integer.parseInt(string);
    }

    public static int a(String string) {
        return n.a(string, 0);
    }
}

