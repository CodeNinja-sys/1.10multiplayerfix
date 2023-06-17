/*
 * Decompiled with CFR 0.150.
 */
package d.b.a.b.a;

import d.b.a.b;
import d.c.a;

public class c
implements b {
    private String a = null;
    private String b = null;
    private String c = null;
    private String d = null;

    public String a() {
        if (this.a == null) {
            this.a = d.c.a.b("sw_vers -productVersion");
        }
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public String b() {
        if (this.b == null && this.a() != null) {
            if ("10.0".equals(this.a()) || this.a().startsWith("10.0.")) {
                this.b = "Cheetah";
            } else if ("10.1".equals(this.a()) || this.a().startsWith("10.1.")) {
                this.b = "Puma";
            } else if ("10.2".equals(this.a()) || this.a().startsWith("10.2.")) {
                this.b = "Jaguar";
            } else if ("10.3".equals(this.a()) || this.a().startsWith("10.3.")) {
                this.b = "Panther";
            } else if ("10.4".equals(this.a()) || this.a().startsWith("10.4.")) {
                this.b = "Tiger";
            } else if ("10.5".equals(this.a()) || this.a().startsWith("10.5.")) {
                this.b = "Leopard";
            } else if ("10.6".equals(this.a()) || this.a().startsWith("10.6.")) {
                this.b = "Snow Leopard";
            } else if ("10.7".equals(this.a()) || this.a().startsWith("10.7.")) {
                this.b = "Lion";
            } else if ("10.8".equals(this.a()) || this.a().startsWith("10.8.")) {
                this.b = "Mountain Lion";
            } else if ("10.9".equals(this.a()) || this.a().startsWith("10.9.")) {
                this.b = "Mavericks";
            } else if ("10.10".equals(this.a()) || this.a().startsWith("10.10.")) {
                this.b = "Yosemite";
            }
        }
        return this.b;
    }

    public void b(String string) {
        this.b = string;
    }

    public String c() {
        if (this.d == null) {
            this.d = d.c.a.b("sw_vers -buildVersion");
        }
        return this.d;
    }

    public void c(String string) {
        this.d = string;
    }

    public String toString() {
        if (this.c == null) {
            this.c = this.a() + " (" + this.b() + ") build " + this.c();
        }
        return this.c;
    }
}

