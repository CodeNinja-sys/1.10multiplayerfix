/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassWriter
 */
package org.lwjgl.util.d;

import org.lwjgl.util.d.k;
import org.objectweb.asm.ClassWriter;

final class m
extends ClassWriter {
    m(int n2) {
        super(n2);
    }

    protected String a(String string, String string2) {
        if (k.t && !string.startsWith("java/") || !string2.startsWith("java/")) {
            return "java/lang/Object";
        }
        return super.getCommonSuperClass(string, string2);
    }
}

