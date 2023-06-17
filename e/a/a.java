/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.g;
import e.a.p;
import e.a.t;
import e.a.u;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;

public class a {
    protected Class a = g.class;
    public int b;
    private t e = p.b();
    public u c = null;
    public int d = 0;

    public a(int n2) {
        this.b = n2;
    }

    public void a() {
        this.e = null;
    }

    public boolean a(LinkedList linkedList) {
        return true;
    }

    public boolean a(byte[] arrby) {
        return false;
    }

    public int b(byte[] arrby) {
        return 1;
    }

    public int b() {
        return 0;
    }

    public float c() {
        return -1.0f;
    }

    public boolean d() {
        return false;
    }

    public void a(AudioFormat audioFormat) {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public boolean k() {
        return false;
    }

    public String l() {
        String string = p.d(this.a);
        if (string.equals("No Sound")) {
            return "Channel";
        }
        return "Channel" + string;
    }

    protected void a(String string) {
        this.e.a(string, 0);
    }

    protected void b(String string) {
        this.e.b(string, 0);
    }

    protected boolean a(boolean bl2, String string) {
        return this.e.a(bl2, this.l(), string, 0);
    }

    protected void c(String string) {
        this.e.a(this.l(), string, 0);
    }

    protected void a(Exception exception) {
        this.e.a(exception, 1);
    }
}

