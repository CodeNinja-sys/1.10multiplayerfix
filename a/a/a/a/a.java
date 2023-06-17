/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a;

import a.a.a.a.a.cy;
import a.a.a.a.b;
import a.a.a.a.i;
import java.util.concurrent.ForkJoinPool;

public class a {
    public static final int a = 0x7FFFFFF7;
    private static final int b = 16;
    private static final int c = 16;
    private static final int d = 8192;
    private static final int e = 128;

    private a() {
    }

    public static void a(int n2, int n3, int n4) {
        if (n3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Start index (" + n3 + ") is negative");
        }
        if (n3 > n4) {
            throw new IllegalArgumentException("Start index (" + n3 + ") is greater than end index (" + n4 + ")");
        }
        if (n4 > n2) {
            throw new ArrayIndexOutOfBoundsException("End index (" + n4 + ") is greater than array length (" + n2 + ")");
        }
    }

    public static void b(int n2, int n3, int n4) {
        if (n3 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n3 + ") is negative");
        }
        if (n4 < 0) {
            throw new IllegalArgumentException("Length (" + n4 + ") is negative");
        }
        if (n3 + n4 > n2) {
            throw new ArrayIndexOutOfBoundsException("Last index (" + (n3 + n4) + ") is greater than array length (" + n2 + ")");
        }
    }

    private static void a(int n2, int n3, int n4, cy cy2, i i2) {
        int n5;
        int n6;
        if (n2 >= n3 || n3 >= n4) {
            return;
        }
        if (n4 - n2 == 2) {
            if (cy2.a(n3, n2) < 0) {
                i2.a(n2, n3);
            }
            return;
        }
        if (n3 - n2 > n4 - n3) {
            n6 = n2 + (n3 - n2) / 2;
            n5 = a.a.a.a.a.b(n3, n4, n6, cy2);
        } else {
            n5 = n3 + (n4 - n3) / 2;
            n6 = a.a.a.a.a.c(n2, n3, n5, cy2);
        }
        int n7 = n6;
        int n8 = n3;
        int n9 = n5;
        if (n8 != n7 && n8 != n9) {
            int n10 = n7;
            int n11 = n8;
            while (n10 < --n11) {
                i2.a(n10++, n11);
            }
            n10 = n8;
            n11 = n9;
            while (n10 < --n11) {
                i2.a(n10++, n11);
            }
            n10 = n7;
            n11 = n9;
            while (n10 < --n11) {
                i2.a(n10++, n11);
            }
        }
        n3 = n6 + (n5 - n3);
        a.a.a.a.a.a(n2, n6, n3, cy2, i2);
        a.a.a.a.a.a(n3, n5, n4, cy2, i2);
    }

    private static int b(int n2, int n3, int n4, cy cy2) {
        int n5 = n3 - n2;
        while (n5 > 0) {
            int n6 = n5 / 2;
            int n7 = n2 + n6;
            if (cy2.a(n7, n4) < 0) {
                n2 = n7 + 1;
                n5 -= n6 + 1;
                continue;
            }
            n5 = n6;
        }
        return n2;
    }

    private static int c(int n2, int n3, int n4, cy cy2) {
        int n5 = n3 - n2;
        while (n5 > 0) {
            int n6 = n5 / 2;
            int n7 = n2 + n6;
            if (cy2.a(n4, n7) < 0) {
                n5 = n6;
                continue;
            }
            n2 = n7 + 1;
            n5 -= n6 + 1;
        }
        return n2;
    }

    private static int d(int n2, int n3, int n4, cy cy2) {
        int n5 = cy2.a(n2, n3);
        int n6 = cy2.a(n2, n4);
        int n7 = cy2.a(n3, n4);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    public static void a(int n2, int n3, cy cy2, i i2) {
        int n4 = n3 - n2;
        if (n4 < 16) {
            for (int i3 = n2; i3 < n3; ++i3) {
                for (int i4 = i3; i4 > n2 && cy2.a(i4 - 1, i4) > 0; --i4) {
                    i2.a(i4, i4 - 1);
                }
            }
            return;
        }
        int n5 = n2 + n3 >>> 1;
        a.a.a.a.a.a(n2, n5, cy2, i2);
        a.a.a.a.a.a(n5, n3, cy2, i2);
        if (cy2.a(n5 - 1, n5) <= 0) {
            return;
        }
        a.a.a.a.a.a(n2, n5, n3, cy2, i2);
    }

    protected static void a(i i2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < n4) {
            i2.a(n2, n3);
            ++n5;
            ++n2;
            ++n3;
        }
    }

    public static void b(int n2, int n3, cy cy2, i i2) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        forkJoinPool.invoke(new b(n2, n3, cy2, i2));
        forkJoinPool.shutdown();
    }

    public static void c(int n2, int n3, cy cy2, i i2) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            for (int i3 = n2; i3 < n3; ++i3) {
                for (int i4 = i3; i4 > n2 && cy2.a(i4 - 1, i4) > 0; --i4) {
                    i2.a(i4, i4 - 1);
                }
            }
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            n6 = n7 / 8;
            n9 = a.a.a.a.a.d(n9, n9 + n6, n9 + 2 * n6, cy2);
            n8 = a.a.a.a.a.d(n8 - n6, n8, n8 + n6, cy2);
            n10 = a.a.a.a.a.d(n10 - 2 * n6, n10 - n6, n10, cy2);
        }
        n8 = a.a.a.a.a.d(n9, n8, n10, cy2);
        int n11 = n6 = n2;
        int n12 = n5 = n3 - 1;
        while (true) {
            if (n11 <= n5 && (n4 = cy2.a(n11, n8)) <= 0) {
                if (n4 == 0) {
                    if (n6 == n8) {
                        n8 = n11;
                    } else if (n11 == n8) {
                        n8 = n6;
                    }
                    i2.a(n6++, n11);
                }
                ++n11;
                continue;
            }
            while (n5 >= n11 && (n4 = cy2.a(n5, n8)) >= 0) {
                if (n4 == 0) {
                    if (n5 == n8) {
                        n8 = n12;
                    } else if (n12 == n8) {
                        n8 = n5;
                    }
                    i2.a(n5, n12--);
                }
                --n5;
            }
            if (n11 > n5) break;
            if (n11 == n8) {
                n8 = n12;
            } else if (n5 == n8) {
                n8 = n5;
            }
            i2.a(n11++, n5--);
        }
        n4 = Math.min(n6 - n2, n11 - n6);
        a.a.a.a.a.a(i2, n2, n11 - n4, n4);
        n4 = Math.min(n12 - n5, n3 - n12 - 1);
        a.a.a.a.a.a(i2, n11, n3 - n4, n4);
        n4 = n11 - n6;
        if (n4 > 1) {
            a.a.a.a.a.c(n2, n2 + n4, cy2, i2);
        }
        if ((n4 = n12 - n5) > 1) {
            a.a.a.a.a.c(n3 - n4, n3, cy2, i2);
        }
    }

    static /* synthetic */ int a(int n2, int n3, int n4, cy cy2) {
        return a.a.a.a.a.d(n2, n3, n4, cy2);
    }
}

