/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.a.a;
import org.lwjgl.opencl.a.b;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.bj;

interface an
extends bj {
    public CLMem a(ab var1, long var2, b var4, long var5, long var7, long var9, Buffer var11, IntBuffer var12);

    public CLMem a(ab var1, long var2, b var4, long var5, long var7, long var9, long var11, long var13, Buffer var15, IntBuffer var16);

    public CLMem a(CLMem var1, long var2, int var4, a var5, IntBuffer var6);

    public ByteBuffer a(CLMem var1);

    public long a(CLMem var1, int var2);

    public b b(CLMem var1);

    public int b(CLMem var1, int var2);

    public int c(CLMem var1);

    public int d(CLMem var1);

    public int c(CLMem var1, int var2);
}

