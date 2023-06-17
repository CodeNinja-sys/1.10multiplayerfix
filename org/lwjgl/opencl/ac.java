/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.IntBuffer;
import java.util.List;
import org.lwjgl.opencl.a.c;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ad;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.bj;
import org.lwjgl.opengl.eh;

interface ac
extends bj {
    public List a(ab var1);

    public ab a(au var1, List var2, ad var3, eh var4, IntBuffer var5);

    public ab a(au var1, long var2, ad var4, eh var5, IntBuffer var6);

    public List a(ab var1, long var2, int var4, c var5);
}

