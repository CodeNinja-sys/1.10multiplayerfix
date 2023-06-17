/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

abstract class cd {
    private StringBuilder a = new StringBuilder();
    private boolean b;

    cd() {
    }

    protected void a(char[] arrc, int n2, int n3) {
        int n4 = n2;
        if (this.b && n3 > 0 && this.a(arrc[n4] == '\n')) {
            ++n4;
        }
        int n5 = n4;
        int n6 = n2 + n3;
        while (n4 < n6) {
            switch (arrc[n4]) {
                case '\r': {
                    this.a.append(arrc, n5, n4 - n5);
                    this.b = true;
                    if (n4 + 1 < n6 && this.a(arrc[n4 + 1] == '\n')) {
                        ++n4;
                    }
                    n5 = n4 + 1;
                    break;
                }
                case '\n': {
                    this.a.append(arrc, n5, n4 - n5);
                    this.a(true);
                    n5 = n4 + 1;
                    break;
                }
            }
            ++n4;
        }
        this.a.append(arrc, n5, n2 + n3 - n5);
    }

    private boolean a(boolean bl2) {
        this.a(this.a.toString(), this.b ? (bl2 ? "\r\n" : "\r") : (bl2 ? "\n" : ""));
        this.a = new StringBuilder();
        this.b = false;
        return bl2;
    }

    protected void a() {
        if (this.b || this.a.length() > 0) {
            this.a(false);
        }
    }

    protected abstract void a(String var1, String var2);
}

