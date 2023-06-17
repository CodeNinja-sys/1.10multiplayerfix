/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.av;
import io.netty.util.c.a.bn;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

final class bm
extends av {
    bn a;
    volatile bn f;
    volatile Thread g;
    volatile int h;
    static final int i = 1;
    static final int j = 2;
    static final int k = 4;
    private static final Unsafe m;
    private static final long n;
    static final /* synthetic */ boolean l;

    bm(bn bn2) {
        super(-2, null, null, null);
        this.f = bn2;
        bn bn3 = null;
        bn bn4 = bn2;
        while (bn4 != null) {
            bn bn5 = (bn)bn4.e;
            bn4.g = null;
            bn4.f = null;
            if (bn3 == null) {
                bn4.a = null;
                bn4.i = false;
                bn3 = bn4;
            } else {
                bn bn6;
                int n2;
                Object object = bn4.c;
                int n3 = bn4.b;
                Class class_ = null;
                bn bn7 = bn3;
                do {
                    int n4;
                    n2 = (n4 = bn7.b) > n3 ? -1 : (n4 < n3 ? 1 : (class_ != null || (class_ = io.netty.util.c.a.a.a(object)) != null ? io.netty.util.c.a.a.a(class_, object, bn7.c) : 0));
                    bn6 = bn7;
                } while ((bn7 = n2 <= 0 ? bn7.f : bn7.g) != null);
                bn4.a = bn6;
                if (n2 <= 0) {
                    bn6.f = bn4;
                } else {
                    bn6.g = bn4;
                }
                bn3 = bm.c(bn3, bn4);
            }
            bn4 = bn5;
        }
        this.a = bn3;
    }

    private final void a() {
        if (!m.compareAndSwapInt(this, n, 0, 1)) {
            this.c();
        }
    }

    private final void b() {
        this.h = 0;
    }

    private final void c() {
        boolean bl2 = false;
        while (true) {
            int n2;
            if (((n2 = this.h) & 1) == 0) {
                if (!m.compareAndSwapInt(this, n, n2, 1)) continue;
                if (bl2) {
                    this.g = null;
                }
                return;
            }
            if ((n2 & 2) == 0) {
                if (!m.compareAndSwapInt(this, n, n2, n2 | 2)) continue;
                bl2 = true;
                this.g = Thread.currentThread();
                continue;
            }
            if (!bl2) continue;
            LockSupport.park(this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    final av a(int n2, Object object) {
        if (object != null) {
            av av2 = this.f;
            while (av2 != null) {
                int n3 = this.h;
                if ((n3 & 3) != 0) {
                    Object object2;
                    if (av2.b == n2 && ((object2 = av2.c) == object || object2 != null && object.equals(object2))) {
                        return av2;
                    }
                } else if (m.compareAndSwapInt(this, n, n3, n3 + 4)) {
                    bn bn2;
                    try {
                        bn bn3 = this.a;
                        bn2 = bn3 == null ? null : bn3.a(n2, object, null);
                    }
                    finally {
                        Thread thread;
                        int n4;
                        while (!m.compareAndSwapInt(this, n, n4 = this.h, n4 - 4)) {
                        }
                        if (n4 == 6 && (thread = this.g) != null) {
                            LockSupport.unpark(thread);
                        }
                    }
                    return bn2;
                }
                av2 = av2.e;
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final bn a(int n2, Object object, Object object2) {
        block21: {
            bn bn2;
            bn bn3;
            int n3;
            Class class_ = null;
            bn bn4 = this.a;
            do {
                if (bn4 == null) {
                    this.f = this.a = new bn(n2, object, object2, null, null);
                    break block21;
                }
                int n4 = bn4.b;
                if (n4 > n2) {
                    n3 = -1;
                } else if (n4 < n2) {
                    n3 = 1;
                } else {
                    Object object3 = bn4.c;
                    if (object3 == object || object3 != null && object.equals(object3)) {
                        return bn4;
                    }
                    if (class_ == null && (class_ = io.netty.util.c.a.a.a(object)) == null || (n3 = io.netty.util.c.a.a.a(class_, object, object3)) == 0) {
                        if (bn4.f == null) {
                            n3 = 1;
                        } else {
                            bn bn5;
                            bn bn6 = bn4.g;
                            if (bn6 == null || (bn5 = bn6.a(n2, object, class_)) == null) {
                                n3 = -1;
                            } else {
                                return bn5;
                            }
                        }
                    }
                }
                bn3 = bn4;
            } while ((bn4 = n3 < 0 ? bn4.f : bn4.g) != null);
            bn bn7 = this.f;
            this.f = bn2 = new bn(n2, object, object2, bn7, bn3);
            if (bn7 != null) {
                bn7.h = bn2;
            }
            if (n3 < 0) {
                bn3.f = bn2;
            } else {
                bn3.g = bn2;
            }
            if (!bn3.i) {
                bn2.i = true;
            } else {
                this.a();
                try {
                    this.a = bm.c(this.a, bn2);
                }
                finally {
                    this.b();
                }
            }
        }
        if (!l && !bm.b(this.a)) {
            throw new AssertionError();
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final boolean a(bn bn2) {
        bn bn3;
        bn bn4 = (bn)bn2.e;
        bn bn5 = bn2.h;
        if (bn5 == null) {
            this.f = bn4;
        } else {
            bn5.e = bn4;
        }
        if (bn4 != null) {
            bn4.h = bn5;
        }
        if (this.f == null) {
            this.a = null;
            return true;
        }
        bn bn6 = this.a;
        if (bn6 == null || bn6.g == null || (bn3 = bn6.f) == null || bn3.f == null) {
            return true;
        }
        this.a();
        try {
            bn bn7;
            bn bn8;
            bn bn9 = bn2.f;
            bn bn10 = bn2.g;
            if (bn9 != null && bn10 != null) {
                bn bn11;
                bn8 = bn10;
                while ((bn11 = bn8.f) != null) {
                    bn8 = bn11;
                }
                boolean bl2 = bn8.i;
                bn8.i = bn2.i;
                bn2.i = bl2;
                bn bn12 = bn8.g;
                bn bn13 = bn2.a;
                if (bn8 == bn10) {
                    bn2.a = bn8;
                    bn8.g = bn2;
                } else {
                    bn bn14 = bn8.a;
                    bn2.a = bn14;
                    if (bn2.a != null) {
                        if (bn8 == bn14.f) {
                            bn14.f = bn2;
                        } else {
                            bn14.g = bn2;
                        }
                    }
                    bn8.g = bn10;
                    bn10.a = bn8;
                }
                bn2.f = null;
                bn8.f = bn9;
                bn9.a = bn8;
                bn2.g = bn12;
                if (bn2.g != null) {
                    bn12.a = bn2;
                }
                if ((bn8.a = bn13) == null) {
                    bn6 = bn8;
                } else if (bn2 == bn13.f) {
                    bn13.f = bn8;
                } else {
                    bn13.g = bn8;
                }
                bn7 = bn12 != null ? bn12 : bn2;
            } else {
                bn7 = bn9 != null ? bn9 : (bn10 != null ? bn10 : bn2);
            }
            if (bn7 != bn2) {
                bn7.a = bn2.a;
                bn8 = bn7.a;
                if (bn8 == null) {
                    bn6 = bn7;
                } else if (bn2 == bn8.f) {
                    bn8.f = bn7;
                } else {
                    bn8.g = bn7;
                }
                bn2.a = null;
                bn2.g = null;
                bn2.f = null;
            }
            bn bn15 = this.a = bn2.i ? bn6 : bm.d(bn6, bn7);
            if (bn2 == bn7 && (bn8 = bn2.a) != null) {
                if (bn2 == bn8.f) {
                    bn8.f = null;
                } else if (bn2 == bn8.g) {
                    bn8.g = null;
                }
                bn2.a = null;
            }
        }
        finally {
            this.b();
        }
        if (!l && !bm.b(this.a)) {
            throw new AssertionError();
        }
        return false;
    }

    static bn a(bn bn2, bn bn3) {
        bn bn4;
        if (bn3 != null && (bn4 = bn3.g) != null) {
            bn bn5 = bn3.g = bn4.f;
            if (bn3.g != null) {
                bn5.a = bn3;
            }
            bn bn6 = bn4.a = bn3.a;
            if (bn4.a == null) {
                bn2 = bn4;
                bn4.i = false;
            } else if (bn6.f == bn3) {
                bn6.f = bn4;
            } else {
                bn6.g = bn4;
            }
            bn4.f = bn3;
            bn3.a = bn4;
        }
        return bn2;
    }

    static bn b(bn bn2, bn bn3) {
        bn bn4;
        if (bn3 != null && (bn4 = bn3.f) != null) {
            bn bn5 = bn3.f = bn4.g;
            if (bn3.f != null) {
                bn5.a = bn3;
            }
            bn bn6 = bn4.a = bn3.a;
            if (bn4.a == null) {
                bn2 = bn4;
                bn4.i = false;
            } else if (bn6.g == bn3) {
                bn6.g = bn4;
            } else {
                bn6.f = bn4;
            }
            bn4.g = bn3;
            bn3.a = bn4;
        }
        return bn2;
    }

    static bn c(bn bn2, bn bn3) {
        bn3.i = true;
        while (true) {
            bn bn4;
            bn bn5;
            if ((bn5 = bn3.a) == null) {
                bn3.i = false;
                return bn3;
            }
            if (!bn5.i || (bn4 = bn5.a) == null) {
                return bn2;
            }
            bn bn6 = bn4.f;
            if (bn5 == bn6) {
                bn bn7 = bn4.g;
                if (bn7 != null && bn7.i) {
                    bn7.i = false;
                    bn5.i = false;
                    bn4.i = true;
                    bn3 = bn4;
                    continue;
                }
                if (bn3 == bn5.g) {
                    bn3 = bn5;
                    bn2 = bm.a(bn2, bn3);
                    bn5 = bn3.a;
                    bn bn8 = bn4 = bn5 == null ? null : bn5.a;
                }
                if (bn5 == null) continue;
                bn5.i = false;
                if (bn4 == null) continue;
                bn4.i = true;
                bn2 = bm.b(bn2, bn4);
                continue;
            }
            if (bn6 != null && bn6.i) {
                bn6.i = false;
                bn5.i = false;
                bn4.i = true;
                bn3 = bn4;
                continue;
            }
            if (bn3 == bn5.f) {
                bn3 = bn5;
                bn2 = bm.b(bn2, bn3);
                bn5 = bn3.a;
                bn bn9 = bn4 = bn5 == null ? null : bn5.a;
            }
            if (bn5 == null) continue;
            bn5.i = false;
            if (bn4 == null) continue;
            bn4.i = true;
            bn2 = bm.a(bn2, bn4);
        }
    }

    static bn d(bn bn2, bn bn3) {
        while (bn3 != null && bn3 != bn2) {
            bn bn4;
            bn bn5;
            bn bn6 = bn3.a;
            if (bn6 == null) {
                bn3.i = false;
                return bn3;
            }
            if (bn3.i) {
                bn3.i = false;
                return bn2;
            }
            bn bn7 = bn6.f;
            if (bn7 == bn3) {
                bn bn8 = bn6.g;
                if (bn8 != null && bn8.i) {
                    bn8.i = false;
                    bn6.i = true;
                    bn2 = bm.a(bn2, bn6);
                    bn6 = bn3.a;
                    bn bn9 = bn8 = bn6 == null ? null : bn6.g;
                }
                if (bn8 == null) {
                    bn3 = bn6;
                    continue;
                }
                bn5 = bn8.f;
                bn4 = bn8.g;
                if (!(bn4 != null && bn4.i || bn5 != null && bn5.i)) {
                    bn8.i = true;
                    bn3 = bn6;
                    continue;
                }
                if (bn4 == null || !bn4.i) {
                    if (bn5 != null) {
                        bn5.i = false;
                    }
                    bn8.i = true;
                    bn2 = bm.b(bn2, bn8);
                    bn6 = bn3.a;
                    bn bn10 = bn8 = bn6 == null ? null : bn6.g;
                }
                if (bn8 != null) {
                    bn8.i = bn6 == null ? false : bn6.i;
                    bn4 = bn8.g;
                    if (bn4 != null) {
                        bn4.i = false;
                    }
                }
                if (bn6 != null) {
                    bn6.i = false;
                    bn2 = bm.a(bn2, bn6);
                }
                bn3 = bn2;
                continue;
            }
            if (bn7 != null && bn7.i) {
                bn7.i = false;
                bn6.i = true;
                bn2 = bm.b(bn2, bn6);
                bn6 = bn3.a;
                bn bn11 = bn7 = bn6 == null ? null : bn6.f;
            }
            if (bn7 == null) {
                bn3 = bn6;
                continue;
            }
            bn5 = bn7.f;
            bn4 = bn7.g;
            if (!(bn5 != null && bn5.i || bn4 != null && bn4.i)) {
                bn7.i = true;
                bn3 = bn6;
                continue;
            }
            if (bn5 == null || !bn5.i) {
                if (bn4 != null) {
                    bn4.i = false;
                }
                bn7.i = true;
                bn2 = bm.a(bn2, bn7);
                bn6 = bn3.a;
                bn bn12 = bn7 = bn6 == null ? null : bn6.f;
            }
            if (bn7 != null) {
                bn7.i = bn6 == null ? false : bn6.i;
                bn5 = bn7.f;
                if (bn5 != null) {
                    bn5.i = false;
                }
            }
            if (bn6 != null) {
                bn6.i = false;
                bn2 = bm.b(bn2, bn6);
            }
            bn3 = bn2;
        }
        return bn2;
    }

    static boolean b(bn bn2) {
        bn bn3 = bn2.a;
        bn bn4 = bn2.f;
        bn bn5 = bn2.g;
        bn bn6 = bn2.h;
        bn bn7 = (bn)bn2.e;
        if (bn6 != null && bn6.e != bn2) {
            return false;
        }
        if (bn7 != null && bn7.h != bn2) {
            return false;
        }
        if (bn3 != null && bn2 != bn3.f && bn2 != bn3.g) {
            return false;
        }
        if (bn4 != null && (bn4.a != bn2 || bn4.b > bn2.b)) {
            return false;
        }
        if (bn5 != null && (bn5.a != bn2 || bn5.b < bn2.b)) {
            return false;
        }
        if (bn2.i && bn4 != null && bn4.i && bn5 != null && bn5.i) {
            return false;
        }
        if (bn4 != null && !bm.b(bn4)) {
            return false;
        }
        return bn5 == null || bm.b(bn5);
    }

    static {
        l = !a.class.desiredAssertionStatus();
        try {
            m = io.netty.util.c.a.a.g();
            Class<bm> class_ = bm.class;
            n = m.objectFieldOffset(class_.getDeclaredField("lockState"));
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }
}

