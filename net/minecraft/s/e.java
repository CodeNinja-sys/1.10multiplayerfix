/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import java.nio.ByteBuffer;
import net.minecraft.client.g.at;
import net.minecraft.client.g.d.f;
import net.minecraft.client.g.g;
import net.minecraft.s.t;

public class e {
    private g a;

    public e(g g2) {
        this.a = g2;
    }

    public e a(g g2) {
        this.a = g2;
        return this;
    }

    public void a(float f2, float f3, float f4) {
        this.a.a(f2, f3, f4);
    }

    public void a(int n2) {
        this.a.a(n2);
    }

    public ByteBuffer a() {
        return this.a.f();
    }

    public void b(float f2, float f3, float f4) {
        this.a.b(f2, f3, f4);
    }

    public int b() {
        return this.a.i();
    }

    public void a(double d2, double d3, double d4) {
        this.a.c(d2, d3, d4);
    }

    public void a(at at2) {
        this.a.a(at2);
    }

    public void c() {
        this.a.d();
    }

    public e c(float f2, float f3, float f4) {
        return this.a(this.a.c(f2, f3, f4));
    }

    public void d() {
        this.a.e();
    }

    public void a(int n2, f f2) {
        this.a.a(n2, f2);
    }

    public e a(int n2, int n3, int n4, int n5) {
        return this.a(this.a.b(n2, n3, n4, n5));
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.a.a(n2, n3, n4, n5);
    }

    public void b(double d2, double d3, double d4) {
        this.a.a(d2, d3, d4);
    }

    public void a(float f2, float f3, float f4, int n2) {
        this.a.b(f2, f3, f4, n2);
    }

    public e a(float f2, float f3, float f4, float f5) {
        return this.a(this.a.a(f2, f3, f4, f5));
    }

    public t e() {
        return new t(this.a.g());
    }

    public void b(float f2, float f3, float f4, int n2) {
        this.a.a(f2, f3, f4, n2);
    }

    public e a(int n2, int n3) {
        return this.a(this.a.a(n2, n3));
    }

    public void a(int[] arrn) {
        this.a.a(arrn);
    }

    public e a(double d2, double d3) {
        return this.a(this.a.a(d2, d3));
    }

    public int f() {
        return this.a.h();
    }

    public void g() {
        this.a.b();
    }

    public e c(double d2, double d3, double d4) {
        return this.a(this.a.b(d2, d3, d4));
    }

    public void d(float f2, float f3, float f4) {
        this.a.d(f2, f3, f4);
    }

    public void h() {
        this.a.c();
    }
}

