/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassAdapter
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.FieldVisitor
 *  org.objectweb.asm.MethodVisitor
 */
package org.lwjgl.util.d;

import org.lwjgl.d;
import org.lwjgl.util.d.k;
import org.lwjgl.util.d.p;
import org.lwjgl.util.d.r;
import org.lwjgl.util.d.s;
import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

class q
extends ClassAdapter {
    final String a;
    boolean b;

    q(ClassVisitor classVisitor, String string) {
        super(classVisitor);
        this.a = string;
    }

    public FieldVisitor a(int n2, String string, String string2, String string3, Object object) {
        p p2 = (p)k.d.get(this.a);
        if (p2 != null && p2.g.containsKey(string)) {
            if (k.a) {
                d.a((CharSequence)(k.class.getSimpleName() + ": discarding field: " + this.a + "." + string + ":" + string2));
            }
            return null;
        }
        if ((n2 & 8) == 0) {
            return new r(this, n2, string, string2, string3, object);
        }
        return super.visitField(n2, string, string2, string3, object);
    }

    public MethodVisitor a(int n2, String string, String string2, String string3, String[] arrstring) {
        p p2;
        if ("<init>".equals(string) && (p2 = (p)k.d.get(this.a)) != null) {
            if (!"()V".equals(string2)) {
                throw new ClassFormatError(this.a + " can only have a default constructor, found: " + string2);
            }
            MethodVisitor methodVisitor = super.visitMethod(n2, string, string2, string3, arrstring);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(183, k.e, "<init>", "()V");
            methodVisitor.visitInsn(177);
            methodVisitor.visitMaxs(0, 0);
            string = "constructView$LWJGL";
        }
        p2 = super.visitMethod(n2, string, string2, string3, arrstring);
        return new s(this, n2, string, string2, string3, arrstring, (MethodVisitor)p2);
    }

    static /* synthetic */ ClassVisitor a(q q2) {
        return q2.cv;
    }

    static /* synthetic */ ClassVisitor b(q q2) {
        return q2.cv;
    }

    static /* synthetic */ ClassVisitor c(q q2) {
        return q2.cv;
    }

    static /* synthetic */ ClassVisitor d(q q2) {
        return q2.cv;
    }
}

