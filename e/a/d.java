/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.p;
import e.a.t;
import java.net.URL;

public class d {
    private t a = p.b();
    private String b = null;
    private URL c = null;

    public d(URL uRL, String string) {
        this.b = string;
        this.c = uRL;
    }

    public d(String string) {
        this.b = string;
        this.c = null;
    }

    public String a() {
        return this.b;
    }

    public URL b() {
        if (this.c == null) {
            if (this.b.matches(p.h)) {
                try {
                    this.c = new URL(this.b);
                }
                catch (Exception exception) {
                    this.a("Unable to access online URL in method 'getURL'");
                    this.a(exception);
                    return null;
                }
            } else {
                this.c = this.getClass().getClassLoader().getResource(p.k() + this.b);
            }
        }
        return this.c;
    }

    private void a(String string) {
        this.a.a("MidiChannel", string, 0);
    }

    private void a(Exception exception) {
        this.a.a(exception, 1);
    }
}

