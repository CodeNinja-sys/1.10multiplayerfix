/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.a;
import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.ip;
import com.sun.jna.a.d.ir;
import com.sun.jna.a.d.is;
import com.sun.jna.b.e;

public class ds {
    ip a = null;

    public ds(ip ip2) {
        this.a = ip2;
    }

    public void a() {
        if (this.a != null) {
            if (!com.sun.jna.a.d.a.g.a(this.a)) {
                throw new dy(ac.g.f());
            }
            this.a = null;
        }
    }

    public is b() {
        e e2 = new e();
        com.sun.jna.a.d.a.g.a(this.a, 0, null, 0, e2);
        is is2 = new is(e2.d());
        if (!com.sun.jna.a.d.a.g.a(this.a, 0, is2, is2.e(), e2)) {
            throw new dy(ac.g.f());
        }
        return is2;
    }

    public void c() {
        this.g();
        if (this.b().b == 4) {
            return;
        }
        if (!com.sun.jna.a.d.a.g.a(this.a, 0, (String[])null)) {
            throw new dy(ac.g.f());
        }
        this.g();
        if (this.b().b != 4) {
            throw new RuntimeException("Unable to start the service");
        }
    }

    public void d() {
        this.g();
        if (this.b().b == 1) {
            return;
        }
        if (!com.sun.jna.a.d.a.g.a(this.a, 1, new ir())) {
            throw new dy(ac.g.f());
        }
        this.g();
        if (this.b().b != 1) {
            throw new RuntimeException("Unable to stop the service");
        }
    }

    public void e() {
        this.g();
        if (this.b().b == 4) {
            return;
        }
        if (!com.sun.jna.a.d.a.g.a(this.a, 3, new ir())) {
            throw new dy(ac.g.f());
        }
        this.g();
        if (this.b().b != 4) {
            throw new RuntimeException("Unable to continue the service");
        }
    }

    public void f() {
        this.g();
        if (this.b().b == 7) {
            return;
        }
        if (!com.sun.jna.a.d.a.g.a(this.a, 2, new ir())) {
            throw new dy(ac.g.f());
        }
        this.g();
        if (this.b().b != 7) {
            throw new RuntimeException("Unable to pause the service");
        }
    }

    public void g() {
        is is2 = this.b();
        int n2 = is2.H;
        int n3 = ac.g.a();
        while (this.a(is2.b)) {
            if (is2.H != n2) {
                n2 = is2.H;
                n3 = ac.g.a();
            }
            if (ac.g.a() - n3 > is2.I) {
                throw new RuntimeException("Timeout waiting for service to change to a non-pending state.");
            }
            int n4 = is2.I / 10;
            if (n4 < 1000) {
                n4 = 1000;
            } else if (n4 > 10000) {
                n4 = 10000;
            }
            try {
                Thread.sleep(n4);
            }
            catch (InterruptedException interruptedException) {
                throw new RuntimeException(interruptedException);
            }
            is2 = this.b();
        }
    }

    private boolean a(int n2) {
        switch (n2) {
            case 2: 
            case 3: 
            case 5: 
            case 6: {
                return true;
            }
        }
        return false;
    }

    public ip h() {
        return this.a;
    }
}

