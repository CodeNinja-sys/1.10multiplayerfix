/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassAdapter
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.MethodVisitor
 */
package org.lwjgl.util.d;

import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

final class l
extends ClassAdapter {
    private final String[] a = new String[]{"getViewAddress", "next", "getAlign", "getSizeof", "capacity"};

    l(ClassVisitor classVisitor) {
        super(classVisitor);
    }

    public MethodVisitor a(int n2, String string, String string2, String string3, String[] arrstring) {
        for (String string4 : this.a) {
            if (!string.equals(string4)) continue;
            n2 &= 0xFFFFFFEF;
            break;
        }
        return super.visitMethod(n2, string, string2, string3, arrstring);
    }
}

