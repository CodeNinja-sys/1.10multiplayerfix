/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassAdapter
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.MethodVisitor
 */
package org.lwjgl.util.d;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.util.d.i;
import org.lwjgl.util.d.k;
import org.lwjgl.util.d.o;
import org.lwjgl.util.d.p;
import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

final class n
extends ClassAdapter {
    final /* synthetic */ String a;

    n(ClassVisitor classVisitor, String string) {
        this.a = string;
        super(classVisitor);
    }

    public void a() {
        p p2 = (p)k.d.get(this.a);
        this.b();
        this.c();
        this.a(p2);
        this.d();
        this.e();
        for (String string : p2.g.keySet()) {
            o o2 = (o)p2.g.get(string);
            if (o2.d.getDescriptor().length() > 1) {
                this.a(string, o2);
                continue;
            }
            this.b(string, o2);
            this.c(string, o2);
        }
        super.visitEnd();
    }

    private void b() {
        MethodVisitor methodVisitor = super.visitMethod(1, "getViewAddress", "(I)J", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, k.e, "baseAddress", "J");
        methodVisitor.visitVarInsn(21, 1);
        methodVisitor.visitFieldInsn(178, this.a, "SIZEOF", "I");
        methodVisitor.visitInsn(104);
        methodVisitor.visitInsn(133);
        methodVisitor.visitInsn(97);
        if (i.a) {
            methodVisitor.visitInsn(92);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitMethodInsn(184, k.f, "checkAddress", "(JL" + k.e + ";)V");
        }
        methodVisitor.visitInsn(173);
        methodVisitor.visitMaxs(3, 2);
        methodVisitor.visitEnd();
    }

    private void c() {
        MethodVisitor methodVisitor = super.visitMethod(1, "capacity", "()I", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitMethodInsn(182, k.e, "backingByteBuffer", "()L" + k.b(ByteBuffer.class) + ";");
        methodVisitor.visitInsn(89);
        methodVisitor.visitMethodInsn(182, k.b(ByteBuffer.class), "capacity", "()I");
        methodVisitor.visitInsn(95);
        methodVisitor.visitMethodInsn(184, k.b(org.lwjgl.o.class), "getAddress0", "(L" + k.b(Buffer.class) + ";)J");
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(180, k.e, "baseAddress", "J");
        methodVisitor.visitInsn(101);
        methodVisitor.visitInsn(136);
        methodVisitor.visitInsn(96);
        methodVisitor.visitFieldInsn(178, this.a, "SIZEOF", "I");
        methodVisitor.visitInsn(108);
        methodVisitor.visitInsn(172);
        methodVisitor.visitMaxs(3, 1);
        methodVisitor.visitEnd();
    }

    private void a(p p2) {
        MethodVisitor methodVisitor = super.visitMethod(1, "getAlign", "()I", null, null);
        methodVisitor.visitCode();
        k.a(methodVisitor, p2.b);
        methodVisitor.visitInsn(172);
        methodVisitor.visitMaxs(1, 1);
        methodVisitor.visitEnd();
    }

    private void d() {
        MethodVisitor methodVisitor = super.visitMethod(1, "getSizeof", "()I", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitFieldInsn(178, this.a, "SIZEOF", "I");
        methodVisitor.visitInsn(172);
        methodVisitor.visitMaxs(1, 1);
        methodVisitor.visitEnd();
    }

    private void e() {
        MethodVisitor methodVisitor = super.visitMethod(1, "next", "()V", null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitInsn(89);
        methodVisitor.visitFieldInsn(180, k.e, "viewAddress", "J");
        methodVisitor.visitFieldInsn(178, this.a, "SIZEOF", "I");
        methodVisitor.visitInsn(133);
        methodVisitor.visitInsn(97);
        methodVisitor.visitMethodInsn(182, this.a, "setViewAddress", "(J)V");
        methodVisitor.visitInsn(177);
        methodVisitor.visitMaxs(3, 1);
        methodVisitor.visitEnd();
    }

    private void a(String string, o o2) {
        MethodVisitor methodVisitor = super.visitMethod(9, k.a(string), "(L" + this.a + ";I)" + o2.d.getDescriptor(), null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(21, 1);
        methodVisitor.visitMethodInsn(182, this.a, "getViewAddress", "(I)J");
        k.a(methodVisitor, (int)o2.a);
        methodVisitor.visitInsn(133);
        methodVisitor.visitInsn(97);
        k.a(methodVisitor, (int)o2.b);
        methodVisitor.visitMethodInsn(184, k.f, "newBuffer", "(JI)L" + k.b(ByteBuffer.class) + ";");
        methodVisitor.visitInsn(176);
        methodVisitor.visitMaxs(3, 2);
        methodVisitor.visitEnd();
    }

    private void b(String string, o o2) {
        MethodVisitor methodVisitor = super.visitMethod(9, k.a(string), "(L" + this.a + ";I)" + o2.d.getDescriptor(), null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(21, 1);
        methodVisitor.visitMethodInsn(182, this.a, "getViewAddress", "(I)J");
        k.a(methodVisitor, (int)o2.a);
        methodVisitor.visitInsn(133);
        methodVisitor.visitInsn(97);
        methodVisitor.visitMethodInsn(184, k.f, o2.a() + "get", "(J)" + o2.d.getDescriptor());
        methodVisitor.visitInsn(o2.d.getOpcode(172));
        methodVisitor.visitMaxs(3, 2);
        methodVisitor.visitEnd();
    }

    private void c(String string, o o2) {
        MethodVisitor methodVisitor = super.visitMethod(9, k.b(string), "(L" + this.a + ";I" + o2.d.getDescriptor() + ")V", null, null);
        methodVisitor.visitCode();
        int n2 = 0;
        switch (o2.d.getSort()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                n2 = 21;
                break;
            }
            case 6: {
                n2 = 23;
                break;
            }
            case 7: {
                n2 = 22;
                break;
            }
            case 8: {
                n2 = 24;
            }
        }
        methodVisitor.visitVarInsn(n2, 2);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(21, 1);
        methodVisitor.visitMethodInsn(182, this.a, "getViewAddress", "(I)J");
        k.a(methodVisitor, (int)o2.a);
        methodVisitor.visitInsn(133);
        methodVisitor.visitInsn(97);
        methodVisitor.visitMethodInsn(184, k.f, o2.a() + "put", "(" + o2.d.getDescriptor() + "J)V");
        methodVisitor.visitInsn(177);
        methodVisitor.visitMaxs(4, 4);
        methodVisitor.visitEnd();
    }
}

