/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.MethodVisitor
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.FieldInsnNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 *  org.objectweb.asm.tree.analysis.Analyzer
 *  org.objectweb.asm.tree.analysis.Frame
 *  org.objectweb.asm.tree.analysis.Interpreter
 *  org.objectweb.asm.tree.analysis.SimpleVerifier
 */
package org.lwjgl.util.d;

import java.util.HashMap;
import org.lwjgl.util.d.k;
import org.lwjgl.util.d.p;
import org.lwjgl.util.d.q;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.Interpreter;
import org.objectweb.asm.tree.analysis.SimpleVerifier;

class s
extends MethodNode {
    boolean a;
    final /* synthetic */ MethodVisitor b;
    final /* synthetic */ q c;

    s(q q2, int n2, String string, String string2, String string3, String[] arrstring, MethodVisitor methodVisitor) {
        this.c = q2;
        this.b = methodVisitor;
        super(n2, string, string2, string3, arrstring);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(int n2, int n3) {
        try {
            k.t = true;
            super.visitMaxs(n2, n3);
        }
        finally {
            k.t = false;
        }
    }

    public void a(int n2, String string, String string2, String string3) {
        if (k.d.containsKey(string) || string.startsWith(k.g)) {
            this.a = true;
        }
        super.visitFieldInsn(n2, string, string2, string3);
    }

    public void b(int n2, String string, String string2, String string3) {
        if (k.d.containsKey(string)) {
            this.a = true;
        }
        super.visitMethodInsn(n2, string, string2, string3);
    }

    public void a() {
        if (this.a) {
            this.c.b = true;
            try {
                this.a(this.b());
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
        this.accept(this.b);
    }

    private Frame[] b() {
        Analyzer analyzer = new Analyzer((Interpreter)new SimpleVerifier());
        analyzer.analyze(this.c.a, (MethodNode)this);
        return analyzer.getFrames();
    }

    private void a(Frame[] arrframe) {
        int n2;
        InsnList insnList = this.instructions;
        HashMap hashMap = new HashMap();
        HashMap<AbstractInsnNode, Frame> hashMap2 = new HashMap<AbstractInsnNode, Frame>();
        for (n2 = 0; n2 < arrframe.length; ++n2) {
            hashMap2.put(insnList.get(n2), arrframe[n2]);
        }
        block6: for (n2 = 0; n2 < insnList.size(); ++n2) {
            AbstractInsnNode abstractInsnNode = insnList.get(n2);
            switch (abstractInsnNode.getType()) {
                case 2: {
                    if (abstractInsnNode.getOpcode() != 25) continue block6;
                    FieldInsnNode fieldInsnNode = (VarInsnNode)abstractInsnNode;
                    Object object = (p)hashMap.get(fieldInsnNode.var);
                    if (object == null) continue block6;
                    n2 = k.a(insnList, n2, hashMap2, (VarInsnNode)fieldInsnNode, (p)object, fieldInsnNode.var);
                    continue block6;
                }
                case 4: {
                    FieldInsnNode fieldInsnNode = (FieldInsnNode)abstractInsnNode;
                    Object object = k.a(fieldInsnNode);
                    if (object == null) continue block6;
                    n2 = k.a(insnList, n2, abstractInsnNode, object);
                    continue block6;
                }
                case 5: {
                    MethodInsnNode methodInsnNode = (MethodInsnNode)abstractInsnNode;
                    p p2 = (p)k.d.get(methodInsnNode.owner);
                    if (p2 == null) continue block6;
                    n2 = k.a(insnList, n2, hashMap2, methodInsnNode, p2, hashMap);
                }
            }
        }
    }
}

