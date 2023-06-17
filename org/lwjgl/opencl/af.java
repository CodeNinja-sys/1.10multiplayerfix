/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.util.StringTokenizer;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.d;
import org.lwjgl.opencl.x;

public class af {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final boolean X;

    public af(ae ae2) {
        Object object;
        String string = ae2.a(4144);
        String string2 = ae2.a(4143);
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
        this.e = object.contains("cl_amd_device_attribute_query");
        this.f = object.contains("cl_amd_device_memory_flags");
        this.g = object.contains("cl_amd_fp64");
        this.h = object.contains("cl_amd_media_ops");
        this.i = object.contains("cl_amd_media_ops2");
        this.j = object.contains("cl_amd_offline_devices");
        this.k = object.contains("cl_amd_popcnt");
        this.l = object.contains("cl_amd_printf");
        this.m = object.contains("cl_amd_vec3");
        this.n = object.contains("cl_APPLE_ContextLoggingFunctions") && org.lwjgl.opencl.x.a;
        this.o = object.contains("cl_APPLE_SetMemObjectDestructor") && org.lwjgl.opencl.x.e;
        this.p = object.contains("cl_APPLE_gl_sharing") && org.lwjgl.opencl.x.g;
        this.q = object.contains("cl_ext_atomic_counters_32");
        this.r = object.contains("cl_ext_atomic_counters_64");
        this.s = object.contains("cl_ext_device_fission") && org.lwjgl.opencl.x.bh;
        this.t = object.contains("cl_ext_migrate_memobject") && org.lwjgl.opencl.x.bl;
        this.u = object.contains("cl_intel_immediate_execution");
        this.v = object.contains("cl_intel_printf");
        this.w = object.contains("cl_intel_thread_local_exec");
        this.x = object.contains("cl_khr_3d_image_writes");
        this.y = object.contains("cl_khr_byte_addressable_store");
        this.z = object.contains("cl_khr_depth_images");
        this.A = object.contains("cl_khr_fp16");
        this.B = object.contains("cl_khr_fp64");
        this.C = object.contains("cl_khr_gl_depth_images");
        this.D = object.contains("cl_khr_gl_event") && org.lwjgl.opencl.x.bn;
        this.E = object.contains("cl_khr_gl_msaa_sharing");
        this.F = object.contains("cl_khr_gl_sharing") && org.lwjgl.opencl.x.bp;
        this.G = object.contains("cl_khr_global_int32_base_atomics");
        this.H = object.contains("cl_khr_global_int32_extended_atomics");
        this.I = object.contains("cl_khr_image2d_from_buffer");
        this.J = object.contains("cl_khr_initialize_memory");
        this.K = object.contains("cl_khr_int64_base_atomics");
        this.L = object.contains("cl_khr_int64_extended_atomics");
        this.M = object.contains("cl_khr_local_int32_base_atomics");
        this.N = object.contains("cl_khr_local_int32_extended_atomics");
        this.O = object.contains("cl_khr_mipmap_image");
        this.P = object.contains("cl_khr_mipmap_image_writes");
        this.Q = object.contains("cl_khr_select_fprounding_mode");
        this.R = object.contains("cl_khr_spir");
        this.S = object.contains("cl_khr_srgb_image_writes");
        this.T = object.contains("cl_khr_subgroups") && org.lwjgl.opencl.x.bt;
        this.U = object.contains("cl_khr_terminate_context") && org.lwjgl.opencl.x.bv;
        this.V = object.contains("cl_nv_compiler_options");
        this.W = object.contains("cl_nv_device_attribute_query");
        this.X = object.contains("cl_nv_pragma_unroll");
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
            stringBuilder.append("cl_amd_device_attribute_query ");
        }
        if (this.f) {
            stringBuilder.append("cl_amd_device_memory_flags ");
        }
        if (this.g) {
            stringBuilder.append("cl_amd_fp64 ");
        }
        if (this.h) {
            stringBuilder.append("cl_amd_media_ops ");
        }
        if (this.i) {
            stringBuilder.append("cl_amd_media_ops2 ");
        }
        if (this.j) {
            stringBuilder.append("cl_amd_offline_devices ");
        }
        if (this.k) {
            stringBuilder.append("cl_amd_popcnt ");
        }
        if (this.l) {
            stringBuilder.append("cl_amd_printf ");
        }
        if (this.m) {
            stringBuilder.append("cl_amd_vec3 ");
        }
        if (this.n) {
            stringBuilder.append("cl_apple_contextloggingfunctions ");
        }
        if (this.o) {
            stringBuilder.append("cl_apple_setmemobjectdestructor ");
        }
        if (this.p) {
            stringBuilder.append("cl_apple_gl_sharing ");
        }
        if (this.q) {
            stringBuilder.append("cl_ext_atomic_counters_32 ");
        }
        if (this.r) {
            stringBuilder.append("cl_ext_atomic_counters_64 ");
        }
        if (this.s) {
            stringBuilder.append("cl_ext_device_fission ");
        }
        if (this.t) {
            stringBuilder.append("cl_ext_migrate_memobject ");
        }
        if (this.u) {
            stringBuilder.append("cl_intel_immediate_execution ");
        }
        if (this.v) {
            stringBuilder.append("cl_intel_printf ");
        }
        if (this.w) {
            stringBuilder.append("cl_intel_thread_local_exec ");
        }
        if (this.x) {
            stringBuilder.append("cl_khr_3d_image_writes ");
        }
        if (this.y) {
            stringBuilder.append("cl_khr_byte_addressable_store ");
        }
        if (this.z) {
            stringBuilder.append("cl_khr_depth_images ");
        }
        if (this.A) {
            stringBuilder.append("cl_khr_fp16 ");
        }
        if (this.B) {
            stringBuilder.append("cl_khr_fp64 ");
        }
        if (this.C) {
            stringBuilder.append("cl_khr_gl_depth_images ");
        }
        if (this.D) {
            stringBuilder.append("cl_khr_gl_event ");
        }
        if (this.E) {
            stringBuilder.append("cl_khr_gl_msaa_sharing ");
        }
        if (this.F) {
            stringBuilder.append("cl_khr_gl_sharing ");
        }
        if (this.G) {
            stringBuilder.append("cl_khr_global_int32_base_atomics ");
        }
        if (this.H) {
            stringBuilder.append("cl_khr_global_int32_extended_atomics ");
        }
        if (this.I) {
            stringBuilder.append("cl_khr_image2d_from_buffer ");
        }
        if (this.J) {
            stringBuilder.append("cl_khr_initialize_memory ");
        }
        if (this.K) {
            stringBuilder.append("cl_khr_int64_base_atomics ");
        }
        if (this.L) {
            stringBuilder.append("cl_khr_int64_extended_atomics ");
        }
        if (this.M) {
            stringBuilder.append("cl_khr_local_int32_base_atomics ");
        }
        if (this.N) {
            stringBuilder.append("cl_khr_local_int32_extended_atomics ");
        }
        if (this.O) {
            stringBuilder.append("cl_khr_mipmap_image ");
        }
        if (this.P) {
            stringBuilder.append("cl_khr_mipmap_image_writes ");
        }
        if (this.Q) {
            stringBuilder.append("cl_khr_select_fprounding_mode ");
        }
        if (this.R) {
            stringBuilder.append("cl_khr_spir ");
        }
        if (this.S) {
            stringBuilder.append("cl_khr_srgb_image_writes ");
        }
        if (this.T) {
            stringBuilder.append("cl_khr_subgroups ");
        }
        if (this.U) {
            stringBuilder.append("cl_khr_terminate_context ");
        }
        if (this.V) {
            stringBuilder.append("cl_nv_compiler_options ");
        }
        if (this.W) {
            stringBuilder.append("cl_nv_device_attribute_query ");
        }
        if (this.X) {
            stringBuilder.append("cl_nv_pragma_unroll ");
        }
        return stringBuilder.toString();
    }
}

