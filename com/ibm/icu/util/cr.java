/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.d.kx;
import com.ibm.icu.d.lf;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public final class cr
implements Enumeration {
    private int a;
    private int b;
    private int[] c;
    private int[] d;
    private lf e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private static final lf k = new lf(9, 10, 12, 13, 32, 32);
    private static final int l = 100;
    private static final lf m = lf.a;
    private boolean[] n;

    public cr(String string, lf lf2, boolean bl2) {
        this(string, lf2, bl2, false);
    }

    public cr(String string, lf lf2, boolean bl2, boolean bl3) {
        this.f = string;
        this.g = string.length();
        this.e = lf2 == null ? m : lf2;
        this.i = bl2;
        this.j = bl3;
        this.a = -1;
        this.b = -1;
        if (this.g == 0) {
            this.h = -1;
        } else {
            this.h = 0;
            if (!bl2) {
                this.h = this.b(0);
            }
        }
    }

    public cr(String string, lf lf2) {
        this(string, lf2, false, false);
    }

    public cr(String string, String string2, boolean bl2) {
        this(string, string2, bl2, false);
    }

    public cr(String string, String string2, boolean bl2, boolean bl3) {
        this.e = m;
        if (string2 != null && string2.length() > 0) {
            this.e = new lf();
            this.e.b((CharSequence)string2);
            this.d();
        }
        this.j = bl3;
        this.f = string;
        this.g = string.length();
        this.i = bl2;
        this.a = -1;
        this.b = -1;
        if (this.g == 0) {
            this.h = -1;
        } else {
            this.h = 0;
            if (!bl2) {
                this.h = this.b(0);
            }
        }
    }

    public cr(String string, String string2) {
        this(string, string2, false, false);
    }

    public cr(String string) {
        this(string, k, false, false);
    }

    public boolean a() {
        return this.h >= 0;
    }

    public String b() {
        if (this.a < 0) {
            String string;
            if (this.h < 0) {
                throw new NoSuchElementException("No more tokens in String");
            }
            if (this.i) {
                boolean bl2;
                int n2 = 0;
                int n3 = kx.a(this.f, this.h);
                boolean bl3 = this.n == null ? this.e.b(n3) : (bl2 = n3 < this.n.length && this.n[n3]);
                if (bl2) {
                    if (this.j) {
                        n2 = this.b(this.h);
                    } else {
                        n2 = this.h + kx.a(n3);
                        if (n2 == this.g) {
                            n2 = -1;
                        }
                    }
                } else {
                    n2 = this.a(this.h);
                }
                String string2 = n2 < 0 ? this.f.substring(this.h) : this.f.substring(this.h, n2);
                this.h = n2;
                return string2;
            }
            int n4 = this.a(this.h);
            if (n4 < 0) {
                string = this.f.substring(this.h);
                this.h = n4;
            } else {
                string = this.f.substring(this.h, n4);
                this.h = this.b(n4);
            }
            return string;
        }
        if (this.a >= this.b) {
            throw new NoSuchElementException("No more tokens in String");
        }
        String string = this.d[this.a] >= 0 ? this.f.substring(this.c[this.a], this.d[this.a]) : this.f.substring(this.c[this.a]);
        ++this.a;
        this.h = -1;
        if (this.a < this.b) {
            this.h = this.c[this.a];
        }
        return string;
    }

    public String a(String string) {
        this.e = m;
        if (string != null && string.length() > 0) {
            this.e = new lf();
            this.e.b((CharSequence)string);
        }
        return this.a(this.e);
    }

    public String a(lf lf2) {
        this.e = lf2;
        this.d();
        this.a = -1;
        this.b = -1;
        if (!this.i) {
            this.h = this.b(this.h);
        }
        return this.b();
    }

    public boolean hasMoreElements() {
        return this.a();
    }

    public Object nextElement() {
        return this.b();
    }

    public int c() {
        int n2 = 0;
        if (this.a()) {
            if (this.a >= 0) {
                return this.b - this.a;
            }
            if (this.c == null) {
                this.c = new int[100];
                this.d = new int[100];
            }
            do {
                int n3;
                if (this.c.length == n2) {
                    int[] arrn = this.c;
                    int[] arrn2 = this.d;
                    n3 = arrn.length;
                    int n4 = n3 + 100;
                    this.c = new int[n4];
                    this.d = new int[n4];
                    System.arraycopy(arrn, 0, this.c, 0, n3);
                    System.arraycopy(arrn2, 0, this.d, 0, n3);
                }
                this.c[n2] = this.h;
                if (this.i) {
                    boolean bl2;
                    int n5 = kx.a(this.f, this.h);
                    boolean bl3 = this.n == null ? this.e.b(n5) : (bl2 = n5 < this.n.length && this.n[n5]);
                    if (bl2) {
                        if (this.j) {
                            this.d[n2] = this.b(this.h);
                        } else {
                            n3 = this.h + 1;
                            if (n3 == this.g) {
                                n3 = -1;
                            }
                            this.d[n2] = n3;
                        }
                    } else {
                        this.d[n2] = this.a(this.h);
                    }
                    this.h = this.d[n2];
                } else {
                    this.d[n2] = this.a(this.h);
                    this.h = this.b(this.d[n2]);
                }
                ++n2;
            } while (this.h >= 0);
            this.a = 0;
            this.b = n2;
            this.h = this.c[0];
        }
        return n2;
    }

    private int a(int n2) {
        if (n2 >= 0) {
            int n3 = n2;
            int n4 = 0;
            if (this.n == null) {
                while (!this.e.b(n4 = kx.a(this.f, n3)) && ++n3 < this.g) {
                }
            } else {
                while (!((n4 = kx.a(this.f, n3)) < this.n.length && this.n[n4] || ++n3 >= this.g)) {
                }
            }
            if (n3 < this.g) {
                return n3;
            }
        }
        return -1 - this.g;
    }

    private int b(int n2) {
        if (n2 >= 0) {
            int n3 = n2;
            int n4 = 0;
            if (this.n == null) {
                while (this.e.b(n4 = kx.a(this.f, n3)) && ++n3 < this.g) {
                }
            } else {
                while ((n4 = kx.a(this.f, n3)) < this.n.length && this.n[n4] && ++n3 < this.g) {
                }
            }
            if (n3 < this.g) {
                return n3;
            }
        }
        return -1 - this.g;
    }

    void d() {
        if (this.e == null || this.e.a() == 0) {
            this.n = new boolean[0];
        } else {
            int n2 = this.e.j(this.e.h() - 1);
            if (n2 < 127) {
                int n3;
                this.n = new boolean[n2 + 1];
                int n4 = 0;
                while (-1 != (n3 = this.e.d(n4))) {
                    this.n[n3] = true;
                    ++n4;
                }
            } else {
                this.n = null;
            }
        }
    }
}

