/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.util.StringTokenizer;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.d;
import org.lwjgl.opencl.x;

public class aw {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public aw(au au2) {
        Object object;
        String string = au2.a(2308);
        String string2 = au2.a(2305);
        if (!string2.startsWith("OpenCL ")) {
            throw new RuntimeException("Invalid OpenCL version string: " + string2);
        }
        try {
            object = new StringTokenizer(string2.substring(7), ". ");
            this.a = Integer.parseInt(((StringTokenizer)object).nextToken());
            this.b = Integer.parseInt(((StringTokenizer)object).nextToken());
            this.c = 1 < this.a || 1 == this.a && 1 <= this.b;
            this.d = 1 < this.a || 1 == this.a && 2 <= this.b;
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException("The major and/or minor OpenCL version \"" + string2 + "\" is malformed: " + runtimeException.getMessage());
        }
        object = org.lwjgl.opencl.d.a(string);
        this.e = object.contains("cl_APPLE_ContextLoggingFunctions") && x.a;
        this.f = object.contains("cl_APPLE_SetMemObjectDestructor") && x.e;
        this.g = object.contains("cl_APPLE_gl_sharing") && x.g;
        this.h = object.contains("cl_khr_d3d10_sharing");
        this.i = object.contains("cl_khr_gl_event") && x.bn;
        this.j = object.contains("cl_khr_gl_sharing") && x.bp;
        this.k = object.contains("cl_khr_icd") && x.br;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OpenCL ").append(this.a).append('.').append(this.b);
        stringBuilder.append(" - Extensions: ");
        if (this.e) {
            stringBuilder.append("cl_apple_contextloggingfunctions ");
        }
        if (this.f) {
            stringBuilder.append("cl_apple_setmemobjectdestructor ");
        }
        if (this.g) {
            stringBuilder.append("cl_apple_gl_sharing ");
        }
        if (this.h) {
            stringBuilder.append("cl_khr_d3d10_sharing ");
        }
        if (this.i) {
            stringBuilder.append("cl_khr_gl_event ");
        }
        if (this.j) {
            stringBuilder.append("cl_khr_gl_sharing ");
        }
        if (this.k) {
            stringBuilder.append("cl_khr_icd ");
        }
        return stringBuilder.toString();
    }
}

