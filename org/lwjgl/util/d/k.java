/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassAdapter
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.MethodVisitor
 *  org.objectweb.asm.Opcodes
 *  org.objectweb.asm.Type
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.FieldInsnNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.InsnNode
 *  org.objectweb.asm.tree.IntInsnNode
 *  org.objectweb.asm.tree.LdcInsnNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.TypeInsnNode
 *  org.objectweb.asm.tree.VarInsnNode
 *  org.objectweb.asm.tree.analysis.BasicValue
 *  org.objectweb.asm.tree.analysis.Frame
 *  org.objectweb.asm.util.TraceClassVisitor
 */
package org.lwjgl.util.d;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.d.a;
import org.lwjgl.util.d.d;
import org.lwjgl.util.d.e;
import org.lwjgl.util.d.h;
import org.lwjgl.util.d.i;
import org.lwjgl.util.d.j;
import org.lwjgl.util.d.l;
import org.lwjgl.util.d.m;
import org.lwjgl.util.d.n;
import org.lwjgl.util.d.o;
import org.lwjgl.util.d.p;
import org.lwjgl.util.d.q;
import org.lwjgl.util.d.t;
import org.lwjgl.util.d.u;
import org.lwjgl.util.d.v;
import org.lwjgl.util.d.w;
import org.lwjgl.util.d.x;
import org.lwjgl.util.d.y;
import org.lwjgl.util.d.z;
import org.objectweb.asm.ClassAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.tree.analysis.BasicValue;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.util.TraceClassVisitor;

public class k {
    static final boolean a = org.lwjgl.d.i && org.lwjgl.d.b("org.lwjgl.util.mapped.PrintActivity");
    static final boolean b = a && org.lwjgl.d.b("org.lwjgl.util.mapped.PrintTiming");
    static final boolean c = org.lwjgl.d.i && org.lwjgl.d.b("org.lwjgl.util.mapped.PrintBytecode");
    static final Map d;
    static final String e;
    static final String f;
    static final String g;
    static final String h;
    static final String i;
    static final String j;
    static final String k;
    static final String l = "getViewAddress";
    static final String m = "next";
    static final String n = "getAlign";
    static final String o = "getSizeof";
    static final String p = "capacity";
    static final String q = "constructView$LWJGL";
    static final Map r;
    static final Map s;
    static boolean t;

    public static void a(Class class_) {
        p p2;
        int n2;
        if (org.lwjgl.util.d.j.b) {
            return;
        }
        y y2 = class_.getAnnotation(y.class);
        if (y2 != null && y2.a() < 0) {
            throw new ClassFormatError("Invalid mapped type padding: " + y2.a());
        }
        if (class_.getEnclosingClass() != null && !Modifier.isStatic(class_.getModifiers())) {
            throw new InternalError("only top-level or static inner classes are allowed");
        }
        String string = org.lwjgl.util.d.k.b(class_);
        HashMap<String, o> hashMap = new HashMap<String, o>();
        long l2 = 0L;
        Field[] arrfield = class_.getDeclaredFields();
        int n3 = arrfield.length;
        for (n2 = 0; n2 < n3; ++n2) {
            Field field;
            o o2 = org.lwjgl.util.d.k.a(y2 == null || y2.d(), string, l2, field = arrfield[n2]);
            if (o2 == null) continue;
            hashMap.put(field.getName(), o2);
            l2 = Math.max(l2, o2.a + o2.c);
        }
        int n4 = 4;
        n3 = 0;
        n2 = 0;
        if (y2 != null) {
            n4 = y2.c();
            if (y2.b()) {
                if (y2.a() != 0) {
                    throw new ClassFormatError("Mapped type padding cannot be specified together with cacheLinePadding.");
                }
                int n5 = (int)(l2 % (long)org.lwjgl.util.d.d.a());
                if (n5 != 0) {
                    n3 = org.lwjgl.util.d.d.a() - n5;
                }
                n2 = 1;
            } else {
                n3 = y2.a();
            }
        }
        if (d.put(string, p2 = new p(string, hashMap, (int)(l2 += (long)n3), n4, n3, n2 != 0)) != null) {
            throw new InternalError("duplicate mapped type: " + p2.a);
        }
    }

    private static o a(boolean bl2, String string, long l2, Field field) {
        long l3;
        if (Modifier.isStatic(field.getModifiers())) {
            return null;
        }
        if (!field.getType().isPrimitive() && field.getType() != ByteBuffer.class) {
            throw new ClassFormatError("field '" + string + "." + field.getName() + "' not supported: " + field.getType());
        }
        e e2 = field.getAnnotation(e.class);
        if (e2 == null && !bl2) {
            throw new ClassFormatError("field '" + string + "." + field.getName() + "' missing annotation " + e.class.getName() + ": " + string);
        }
        z z2 = field.getAnnotation(z.class);
        if (z2 != null && field.getType() != Long.TYPE) {
            throw new ClassFormatError("The @Pointer annotation can only be used on long fields. @Pointer field found: " + string + "." + field.getName() + ": " + field.getType());
        }
        if (Modifier.isVolatile(field.getModifiers()) && (z2 != null || field.getType() == ByteBuffer.class)) {
            throw new ClassFormatError("The volatile keyword is not supported for @Pointer or ByteBuffer fields. Volatile field found: " + string + "." + field.getName() + ": " + field.getType());
        }
        if (field.getType() == Long.TYPE || field.getType() == Double.TYPE) {
            l3 = z2 == null ? 8L : (long)org.lwjgl.util.d.t.a.addressSize();
        } else if (field.getType() == Double.TYPE) {
            l3 = 8L;
        } else if (field.getType() == Integer.TYPE || field.getType() == Float.TYPE) {
            l3 = 4L;
        } else if (field.getType() == Character.TYPE || field.getType() == Short.TYPE) {
            l3 = 2L;
        } else if (field.getType() == Byte.TYPE) {
            l3 = 1L;
        } else if (field.getType() == ByteBuffer.class) {
            l3 = e2.b();
            if (l3 < 0L) {
                throw new IllegalStateException("invalid byte length for mapped ByteBuffer field: " + string + "." + field.getName() + " [length=" + l3 + "]");
            }
        } else {
            throw new ClassFormatError(field.getType().getName());
        }
        if (field.getType() != ByteBuffer.class && l2 % l3 != 0L) {
            throw new IllegalStateException("misaligned mapped type: " + string + "." + field.getName());
        }
        a a2 = field.getAnnotation(a.class);
        long l4 = l2;
        if (e2 != null && e2.a() != -1L) {
            if (e2.a() < 0L) {
                throw new ClassFormatError("Invalid field byte offset: " + string + "." + field.getName() + " [byteOffset=" + e2.a() + "]");
            }
            if (a2 != null) {
                throw new ClassFormatError("A field byte offset cannot be specified together with cache-line padding: " + string + "." + field.getName());
            }
            l4 = e2.a();
        }
        long l5 = l3;
        if (a2 != null) {
            if (a2.a() && l4 % (long)org.lwjgl.util.d.d.a() != 0L) {
                l4 += (long)org.lwjgl.util.d.d.a() - (l4 & (long)(org.lwjgl.util.d.d.a() - 1));
            }
            if (a2.b() && (l4 + l3) % (long)org.lwjgl.util.d.d.a() != 0L) {
                l5 += (long)org.lwjgl.util.d.d.a() - (l4 + l3) % (long)org.lwjgl.util.d.d.a();
            }
            assert (!a2.a() || l4 % (long)org.lwjgl.util.d.d.a() == 0L);
            assert (!a2.b() || (l4 + l5) % (long)org.lwjgl.util.d.d.a() == 0L);
        }
        if (a) {
            org.lwjgl.d.a((CharSequence)(k.class.getSimpleName() + ": " + string + "." + field.getName() + " [type=" + field.getType().getSimpleName() + ", offset=" + l4 + "]"));
        }
        return new o(l4, l3, l5, Type.getType(field.getType()), Modifier.isVolatile(field.getModifiers()), z2 != null);
    }

    static byte[] a(byte[] arrby) {
        ClassWriter classWriter = new ClassWriter(0);
        l l2 = new l((ClassVisitor)classWriter);
        new ClassReader(arrby).accept((ClassVisitor)l2, 0);
        return classWriter.toByteArray();
    }

    static byte[] a(String string, byte[] arrby) {
        q q2;
        m m2 = new m(2);
        q q3 = q2 = new q((ClassVisitor)m2, string);
        if (d.containsKey(string)) {
            q3 = org.lwjgl.util.d.k.a(string, (ClassVisitor)q3);
        }
        new ClassReader(arrby).accept((ClassVisitor)q3, 4);
        if (!q2.b) {
            return arrby;
        }
        arrby = m2.toByteArray();
        if (c) {
            org.lwjgl.util.d.k.b(arrby);
        }
        return arrby;
    }

    private static ClassAdapter a(String string, ClassVisitor classVisitor) {
        return new n(classVisitor, string);
    }

    static int a(InsnList insnList, int n2, Map map, MethodInsnNode methodInsnNode, p p2, Map map2) {
        switch (methodInsnNode.getOpcode()) {
            case 182: {
                if ("asArray".equals(methodInsnNode.name) && methodInsnNode.desc.equals("()[L" + e + ";")) {
                    AbstractInsnNode abstractInsnNode = methodInsnNode.getNext();
                    org.lwjgl.util.d.k.a(abstractInsnNode, 192);
                    abstractInsnNode = abstractInsnNode.getNext();
                    org.lwjgl.util.d.k.a(abstractInsnNode, 58);
                    Frame frame = (Frame)map.get((Object)abstractInsnNode);
                    String string = ((BasicValue)frame.getStack(frame.getStackSize() - 1)).getType().getElementType().getInternalName();
                    if (!methodInsnNode.owner.equals(string)) {
                        throw new ClassCastException("Source: " + methodInsnNode.owner + " - Target: " + string);
                    }
                    VarInsnNode varInsnNode = (VarInsnNode)abstractInsnNode;
                    map2.put(varInsnNode.var, p2);
                    insnList.remove(methodInsnNode.getNext());
                    insnList.remove((AbstractInsnNode)methodInsnNode);
                }
                if ("dup".equals(methodInsnNode.name) && methodInsnNode.desc.equals("()L" + e + ";")) {
                    n2 = org.lwjgl.util.d.k.a(insnList, n2, (AbstractInsnNode)methodInsnNode, org.lwjgl.util.d.k.c(methodInsnNode));
                    break;
                }
                if ("slice".equals(methodInsnNode.name) && methodInsnNode.desc.equals("()L" + e + ";")) {
                    n2 = org.lwjgl.util.d.k.a(insnList, n2, (AbstractInsnNode)methodInsnNode, org.lwjgl.util.d.k.b(methodInsnNode));
                    break;
                }
                if ("runViewConstructor".equals(methodInsnNode.name) && "()V".equals(methodInsnNode.desc)) {
                    n2 = org.lwjgl.util.d.k.a(insnList, n2, (AbstractInsnNode)methodInsnNode, org.lwjgl.util.d.k.a(methodInsnNode));
                    break;
                }
                if ("copyTo".equals(methodInsnNode.name) && methodInsnNode.desc.equals("(L" + e + ";)V")) {
                    n2 = org.lwjgl.util.d.k.a(insnList, n2, (AbstractInsnNode)methodInsnNode, org.lwjgl.util.d.k.b(p2));
                    break;
                }
                if (!"copyRange".equals(methodInsnNode.name) || !methodInsnNode.desc.equals("(L" + e + ";I)V")) break;
                n2 = org.lwjgl.util.d.k.a(insnList, n2, (AbstractInsnNode)methodInsnNode, org.lwjgl.util.d.k.a(p2));
                break;
            }
            case 183: {
                if (!methodInsnNode.owner.equals(e) || !"<init>".equals(methodInsnNode.name) || !"()V".equals(methodInsnNode.desc)) break;
                insnList.remove(methodInsnNode.getPrevious());
                insnList.remove((AbstractInsnNode)methodInsnNode);
                n2 -= 2;
                break;
            }
            case 184: {
                boolean bl2;
                boolean bl3 = "map".equals(methodInsnNode.name) && methodInsnNode.desc.equals("(JI)L" + e + ";");
                boolean bl4 = "map".equals(methodInsnNode.name) && methodInsnNode.desc.equals("(Ljava/nio/ByteBuffer;)L" + e + ";");
                boolean bl5 = bl2 = "malloc".equals(methodInsnNode.name) && methodInsnNode.desc.equals("(I)L" + e + ";");
                if (!bl3 && !bl4 && !bl2) break;
                n2 = org.lwjgl.util.d.k.a(insnList, n2, (AbstractInsnNode)methodInsnNode, org.lwjgl.util.d.k.a(p2, methodInsnNode.owner, bl3, bl2));
            }
        }
        return n2;
    }

    private static InsnList a(p p2) {
        InsnList insnList = new InsnList();
        insnList.add(org.lwjgl.util.d.k.a(p2.b));
        insnList.add((AbstractInsnNode)new InsnNode(104));
        insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "copy", "(L" + e + ";L" + e + ";I)V"));
        return insnList;
    }

    private static InsnList b(p p2) {
        InsnList insnList = new InsnList();
        insnList.add(org.lwjgl.util.d.k.a(p2.b - p2.e));
        insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "copy", "(L" + e + ";L" + e + ";I)V"));
        return insnList;
    }

    private static InsnList a(MethodInsnNode methodInsnNode) {
        InsnList insnList = new InsnList();
        insnList.add((AbstractInsnNode)new InsnNode(89));
        insnList.add((AbstractInsnNode)new MethodInsnNode(182, methodInsnNode.owner, q, "()V"));
        return insnList;
    }

    private static InsnList b(MethodInsnNode methodInsnNode) {
        InsnList insnList = new InsnList();
        insnList.add((AbstractInsnNode)new TypeInsnNode(187, methodInsnNode.owner));
        insnList.add((AbstractInsnNode)new InsnNode(89));
        insnList.add((AbstractInsnNode)new MethodInsnNode(183, methodInsnNode.owner, "<init>", "()V"));
        insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "slice", "(L" + e + ";L" + e + ";)L" + e + ";"));
        return insnList;
    }

    private static InsnList c(MethodInsnNode methodInsnNode) {
        InsnList insnList = new InsnList();
        insnList.add((AbstractInsnNode)new TypeInsnNode(187, methodInsnNode.owner));
        insnList.add((AbstractInsnNode)new InsnNode(89));
        insnList.add((AbstractInsnNode)new MethodInsnNode(183, methodInsnNode.owner, "<init>", "()V"));
        insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "dup", "(L" + e + ";L" + e + ";)L" + e + ";"));
        return insnList;
    }

    private static InsnList a(p p2, String string, boolean bl2, boolean bl3) {
        InsnList insnList = new InsnList();
        if (bl3) {
            insnList.add(org.lwjgl.util.d.k.a(p2.b));
            insnList.add((AbstractInsnNode)new InsnNode(104));
            insnList.add((AbstractInsnNode)new MethodInsnNode(184, p2.f ? org.lwjgl.util.d.k.b(d.class) : org.lwjgl.util.d.k.b(BufferUtils.class), "createByteBuffer", "(I)L" + org.lwjgl.util.d.k.b(ByteBuffer.class) + ";"));
        } else if (bl2) {
            insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "newBuffer", "(JI)L" + org.lwjgl.util.d.k.b(ByteBuffer.class) + ";"));
        }
        insnList.add((AbstractInsnNode)new TypeInsnNode(187, string));
        insnList.add((AbstractInsnNode)new InsnNode(89));
        insnList.add((AbstractInsnNode)new MethodInsnNode(183, string, "<init>", "()V"));
        insnList.add((AbstractInsnNode)new InsnNode(90));
        insnList.add((AbstractInsnNode)new InsnNode(95));
        insnList.add(org.lwjgl.util.d.k.a(p2.d));
        insnList.add(org.lwjgl.util.d.k.a(p2.b));
        insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "setup", "(L" + e + ";Ljava/nio/ByteBuffer;II)V"));
        return insnList;
    }

    static InsnList a(FieldInsnNode fieldInsnNode) {
        p p2 = (p)d.get(fieldInsnNode.owner);
        if (p2 == null) {
            if ("view".equals(fieldInsnNode.name) && fieldInsnNode.owner.startsWith(g)) {
                return org.lwjgl.util.d.k.b(fieldInsnNode);
            }
            return null;
        }
        if ("SIZEOF".equals(fieldInsnNode.name)) {
            return org.lwjgl.util.d.k.a(fieldInsnNode, p2);
        }
        if ("view".equals(fieldInsnNode.name)) {
            return org.lwjgl.util.d.k.b(fieldInsnNode, p2);
        }
        if ("baseAddress".equals(fieldInsnNode.name) || "viewAddress".equals(fieldInsnNode.name)) {
            return org.lwjgl.util.d.k.c(fieldInsnNode);
        }
        o o2 = (o)p2.g.get(fieldInsnNode.name);
        if (o2 == null) {
            return null;
        }
        if (fieldInsnNode.desc.equals("L" + org.lwjgl.util.d.k.b(ByteBuffer.class) + ";")) {
            return org.lwjgl.util.d.k.a(fieldInsnNode, p2, o2.a);
        }
        return org.lwjgl.util.d.k.a(fieldInsnNode, o2);
    }

    private static InsnList b(FieldInsnNode fieldInsnNode) {
        if (fieldInsnNode.getOpcode() == 180) {
            org.lwjgl.util.d.k.a(fieldInsnNode.owner, fieldInsnNode.name);
        }
        if (fieldInsnNode.getOpcode() != 181) {
            throw new InternalError();
        }
        InsnList insnList = new InsnList();
        if (h.equals(fieldInsnNode.owner)) {
            insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "put_views", "(L" + h + ";I)V"));
        } else if (i.equals(fieldInsnNode.owner)) {
            insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "put_views", "(L" + i + ";I)V"));
        } else if (j.equals(fieldInsnNode.owner)) {
            insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "put_views", "(L" + j + ";I)V"));
        } else {
            throw new InternalError();
        }
        return insnList;
    }

    private static InsnList a(FieldInsnNode fieldInsnNode, p p2) {
        if (!"I".equals(fieldInsnNode.desc)) {
            throw new InternalError();
        }
        InsnList insnList = new InsnList();
        if (fieldInsnNode.getOpcode() == 178) {
            insnList.add(org.lwjgl.util.d.k.a(p2.b));
            return insnList;
        }
        if (fieldInsnNode.getOpcode() == 179) {
            org.lwjgl.util.d.k.a(fieldInsnNode.owner, fieldInsnNode.name);
        }
        throw new InternalError();
    }

    private static InsnList b(FieldInsnNode fieldInsnNode, p p2) {
        if (!"I".equals(fieldInsnNode.desc)) {
            throw new InternalError();
        }
        InsnList insnList = new InsnList();
        if (fieldInsnNode.getOpcode() == 180) {
            if (p2.c != 0) {
                insnList.add(org.lwjgl.util.d.k.a(p2.c));
                insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "get_view_shift", "(L" + e + ";I)I"));
            } else {
                insnList.add(org.lwjgl.util.d.k.a(p2.b));
                insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "get_view", "(L" + e + ";I)I"));
            }
            return insnList;
        }
        if (fieldInsnNode.getOpcode() == 181) {
            if (p2.c != 0) {
                insnList.add(org.lwjgl.util.d.k.a(p2.c));
                insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "put_view_shift", "(L" + e + ";II)V"));
            } else {
                insnList.add(org.lwjgl.util.d.k.a(p2.b));
                insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "put_view", "(L" + e + ";II)V"));
            }
            return insnList;
        }
        throw new InternalError();
    }

    private static InsnList c(FieldInsnNode fieldInsnNode) {
        if (!"J".equals(fieldInsnNode.desc)) {
            throw new IllegalStateException();
        }
        if (fieldInsnNode.getOpcode() == 180) {
            return null;
        }
        if (fieldInsnNode.getOpcode() == 181) {
            org.lwjgl.util.d.k.a(fieldInsnNode.owner, fieldInsnNode.name);
        }
        throw new InternalError();
    }

    private static InsnList a(FieldInsnNode fieldInsnNode, p p2, long l2) {
        if (fieldInsnNode.getOpcode() == 181) {
            org.lwjgl.util.d.k.a(fieldInsnNode.owner, fieldInsnNode.name);
        }
        if (fieldInsnNode.getOpcode() == 180) {
            InsnList insnList = new InsnList();
            insnList.add((AbstractInsnNode)new FieldInsnNode(180, p2.a, "viewAddress", "J"));
            insnList.add((AbstractInsnNode)new LdcInsnNode((Object)l2));
            insnList.add((AbstractInsnNode)new InsnNode(97));
            insnList.add((AbstractInsnNode)new LdcInsnNode((Object)((o)p2.g.get((Object)fieldInsnNode.name)).b));
            insnList.add((AbstractInsnNode)new InsnNode(136));
            insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, "newBuffer", "(JI)L" + org.lwjgl.util.d.k.b(ByteBuffer.class) + ";"));
            return insnList;
        }
        throw new InternalError();
    }

    private static InsnList a(FieldInsnNode fieldInsnNode, o o2) {
        InsnList insnList = new InsnList();
        if (fieldInsnNode.getOpcode() == 181) {
            insnList.add(org.lwjgl.util.d.k.a((int)o2.a));
            insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, o2.a() + "put", "(L" + e + ";" + fieldInsnNode.desc + "I)V"));
            return insnList;
        }
        if (fieldInsnNode.getOpcode() == 180) {
            insnList.add(org.lwjgl.util.d.k.a((int)o2.a));
            insnList.add((AbstractInsnNode)new MethodInsnNode(184, f, o2.a() + "get", "(L" + e + ";I)" + fieldInsnNode.desc));
            return insnList;
        }
        throw new InternalError();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static int a(InsnList var0, int var1_1, Map var2_2, VarInsnNode var3_3, p var4_4, int var5_5) {
        block8: {
            var6_6 = ((Frame)var2_2.get((Object)var3_3)).getStackSize() + 1;
            var7_7 = var3_3;
            do lbl-1000:
            // 3 sources

            {
                if ((var7_7 = var7_7.getNext()) == null) {
                    throw new InternalError();
                }
                var8_8 = (Frame)var2_2.get((Object)var7_7);
                if (var8_8 == null) ** GOTO lbl-1000
                var9_9 = var8_8.getStackSize();
                if (var9_9 == var6_6 + 1 && var7_7.getOpcode() == 50) {
                    var10_10 = var7_7;
                    break block8;
                }
                if (var9_9 != var6_6 || var7_7.getOpcode() != 190) continue;
                if (org.lwjgl.d.i && var3_3.getNext() != var7_7) {
                    throw new InternalError();
                }
                var0.remove((AbstractInsnNode)var7_7);
                var3_3.var = var5_5;
                var0.insert((AbstractInsnNode)var3_3, (AbstractInsnNode)new MethodInsnNode(182, var4_4.a, "capacity", "()I"));
                return var1_1 + 1;
            } while (var9_9 >= var6_6);
            throw new ClassFormatError("Invalid " + var4_4.a + " view array usage detected: " + org.lwjgl.util.d.k.a((AbstractInsnNode)var7_7));
        }
        while ((var7_7 = var7_7.getNext()) != null) {
            var8_8 = (Frame)var2_2.get((Object)var7_7);
            if (var8_8 == null) continue;
            var9_9 = var8_8.getStackSize();
            if (var9_9 == var6_6 + 1 && var7_7.getOpcode() == 181) {
                var11_11 = (FieldInsnNode)var7_7;
                var0.insert((AbstractInsnNode)var7_7, (AbstractInsnNode)new MethodInsnNode(184, var4_4.a, org.lwjgl.util.d.k.b(var11_11.name), "(L" + var4_4.a + ";I" + var11_11.desc + ")V"));
                var0.remove((AbstractInsnNode)var7_7);
                break;
            }
            if (var9_9 == var6_6 && var7_7.getOpcode() == 180) {
                var11_11 = (FieldInsnNode)var7_7;
                var0.insert((AbstractInsnNode)var7_7, (AbstractInsnNode)new MethodInsnNode(184, var4_4.a, org.lwjgl.util.d.k.a(var11_11.name), "(L" + var4_4.a + ";I)" + var11_11.desc));
                var0.remove((AbstractInsnNode)var7_7);
                break;
            }
            if (var9_9 == var6_6 && var7_7.getOpcode() == 89 && var7_7.getNext().getOpcode() == 180) {
                var11_11 = (FieldInsnNode)var7_7.getNext();
                var12_12 = new MethodInsnNode(184, var4_4.a, org.lwjgl.util.d.k.a(var11_11.name), "(L" + var4_4.a + ";I)" + var11_11.desc);
                var0.insert((AbstractInsnNode)var7_7, (AbstractInsnNode)new InsnNode(92));
                var0.insert(var7_7.getNext(), (AbstractInsnNode)var12_12);
                var0.remove((AbstractInsnNode)var7_7);
                var0.remove((AbstractInsnNode)var11_11);
                var7_7 = var12_12;
                continue;
            }
            if (var9_9 >= var6_6) continue;
            throw new ClassFormatError("Invalid " + var4_4.a + " view array usage detected: " + org.lwjgl.util.d.k.a((AbstractInsnNode)var7_7));
        }
        var0.remove((AbstractInsnNode)var10_10);
        return var1_1;
    }

    private static void a(Class class_, Map map, String ... arrstring) {
        try {
            block2: for (Field field : class_.getFields()) {
                if (!Modifier.isStatic(field.getModifiers()) || field.getType() != Integer.TYPE) continue;
                for (String string : arrstring) {
                    if (field.getName().startsWith(string)) continue block2;
                }
                if (map.put((Integer)field.get(null), field.getName()) == null) continue;
                throw new IllegalStateException();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static String a(AbstractInsnNode abstractInsnNode) {
        String string = (String)r.get(abstractInsnNode.getOpcode());
        return (String)s.get(abstractInsnNode.getType()) + ": " + abstractInsnNode.getOpcode() + (string == null ? "" : " [" + (String)r.get(abstractInsnNode.getOpcode()) + "]");
    }

    static String b(Class class_) {
        return class_.getName().replace('.', '/');
    }

    static String a(String string) {
        return "get$" + Character.toUpperCase(string.charAt(0)) + string.substring(1) + "$LWJGL";
    }

    static String b(String string) {
        return "set$" + Character.toUpperCase(string.charAt(0)) + string.substring(1) + "$LWJGL";
    }

    private static void a(AbstractInsnNode abstractInsnNode, int n2) {
        if (abstractInsnNode == null) {
            throw new ClassFormatError("Unexpected end of instructions after .asArray() method.");
        }
        if (abstractInsnNode.getOpcode() != n2) {
            throw new ClassFormatError("The result of .asArray() must be stored to a local variable. Found: " + org.lwjgl.util.d.k.a(abstractInsnNode));
        }
    }

    static AbstractInsnNode a(int n2) {
        if (n2 <= 5 && -1 <= n2) {
            return new InsnNode(2 + n2 + 1);
        }
        if (n2 >= -128 && n2 <= 127) {
            return new IntInsnNode(16, n2);
        }
        if (n2 >= -32768 && n2 <= 32767) {
            return new IntInsnNode(17, n2);
        }
        return new LdcInsnNode((Object)n2);
    }

    static void a(MethodVisitor methodVisitor, int n2) {
        if (n2 <= 5 && -1 <= n2) {
            methodVisitor.visitInsn(2 + n2 + 1);
        } else if (n2 >= -128 && n2 <= 127) {
            methodVisitor.visitIntInsn(16, n2);
        } else if (n2 >= -32768 && n2 <= 32767) {
            methodVisitor.visitIntInsn(17, n2);
        } else {
            methodVisitor.visitLdcInsn((Object)n2);
        }
    }

    static int a(InsnList insnList, int n2, AbstractInsnNode abstractInsnNode, InsnList insnList2) {
        int n3 = insnList2.size();
        insnList.insert(abstractInsnNode, insnList2);
        insnList.remove(abstractInsnNode);
        return n2 + (n3 - 1);
    }

    private static void a(String string, String string2) {
        throw new IllegalAccessError("The " + string + "." + string2 + " field is final.");
    }

    private static void b(byte[] arrby) {
        StringWriter stringWriter = new StringWriter();
        TraceClassVisitor traceClassVisitor = new TraceClassVisitor((ClassVisitor)new ClassWriter(0), new PrintWriter(stringWriter));
        new ClassReader(arrby).accept((ClassVisitor)traceClassVisitor, 0);
        String string = stringWriter.toString();
        org.lwjgl.d.a((CharSequence)string);
    }

    static {
        e = org.lwjgl.util.d.k.b(i.class);
        f = org.lwjgl.util.d.k.b(h.class);
        g = org.lwjgl.util.d.k.b(u.class);
        h = org.lwjgl.util.d.k.b(v.class);
        i = org.lwjgl.util.d.k.b(w.class);
        j = org.lwjgl.util.d.k.b(x.class);
        k = "L" + org.lwjgl.util.d.k.b(a.class) + ";";
        r = new HashMap();
        s = new HashMap();
        org.lwjgl.util.d.k.a(Opcodes.class, r, "V1_", "ACC_", "T_", "F_", "MH_");
        org.lwjgl.util.d.k.a(AbstractInsnNode.class, s, new String[0]);
        d = new HashMap();
        d.put(e, new p(e, null, -1, -1, -1, false));
        String string = System.getProperty("java.vm.name");
        if (string != null && !string.contains("Server")) {
            System.err.println("Warning: " + i.class.getSimpleName() + "s have inferiour performance on Client VMs, please consider switching to a Server VM.");
        }
    }
}

