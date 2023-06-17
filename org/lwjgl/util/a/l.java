/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import org.lwjgl.util.a.n;

public class l
extends n {
    private static final String a = "1.3";
    private static final String b = "GLU_EXT_nurbs_tessellator GLU_EXT_object_space_tess ";

    public static String a(int n2) {
        if (n2 == 100800) {
            return a;
        }
        if (n2 == 100801) {
            return b;
        }
        return null;
    }

    public static boolean a(String string, String string2) {
        if (string2 == null || string == null) {
            return false;
        }
        return string2.indexOf(string) != -1;
    }
}

