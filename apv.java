/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.yk;
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;

public class apv {
    private static final int a = (int)Math.pow(16.0, 0.0);
    private static final int b = (int)Math.pow(16.0, 1.0);
    private static final int c = (int)Math.pow(16.0, 2.0);
    private final BitSet d = new BitSet(4096);
    private static final int[] e = new int[1352];
    private int f = 4096;

    public void a(cmz cmz2) {
        this.d.set(apv.c(cmz2), true);
        --this.f;
    }

    private static int c(cmz cmz2) {
        return apv.a(cmz2.a() & 0xF, cmz2.b() & 0xF, cmz2.c() & 0xF);
    }

    private static int a(int n2, int n3, int n4) {
        return n2 << 0 | n3 << 8 | n4 << 4;
    }

    public gy a() {
        gy gy2 = new gy();
        if (4096 - this.f < 256) {
            gy2.a(true);
        } else if (this.f == 0) {
            gy2.a(false);
        } else {
            for (int n2 : e) {
                if (this.d.get(n2)) continue;
                gy2.a(this.a(n2));
            }
        }
        return gy2;
    }

    public Set b(cmz cmz2) {
        return this.a(apv.c(cmz2));
    }

    private Set a(int n2) {
        EnumSet<bqk> enumSet = EnumSet.noneOf(bqk.class);
        ArrayDeque arrayDeque = yk.a();
        arrayDeque.add(fz.a(n2));
        this.d.set(n2, true);
        while (!arrayDeque.isEmpty()) {
            int n3 = (Integer)arrayDeque.poll();
            this.a(n3, enumSet);
            for (bqk bqk2 : bqk.values()) {
                int n4 = this.a(n3, bqk2);
                if (n4 < 0 || this.d.get(n4)) continue;
                this.d.set(n4, true);
                arrayDeque.add(fz.a(n4));
            }
        }
        return enumSet;
    }

    private void a(int n2, Set set) {
        int n3 = n2 >> 0 & 0xF;
        if (n3 == 0) {
            set.add(bqk.e);
        } else if (n3 == 15) {
            set.add(bqk.f);
        }
        int n4 = n2 >> 8 & 0xF;
        if (n4 == 0) {
            set.add(bqk.a);
        } else if (n4 == 15) {
            set.add(bqk.b);
        }
        int n5 = n2 >> 4 & 0xF;
        if (n5 == 0) {
            set.add(bqk.c);
        } else if (n5 == 15) {
            set.add(bqk.d);
        }
    }

    private int a(int n2, bqk bqk2) {
        switch (bqk2) {
            case a: {
                if ((n2 >> 8 & 0xF) == 0) {
                    return -1;
                }
                return n2 - c;
            }
            case b: {
                if ((n2 >> 8 & 0xF) == 15) {
                    return -1;
                }
                return n2 + c;
            }
            case c: {
                if ((n2 >> 4 & 0xF) == 0) {
                    return -1;
                }
                return n2 - b;
            }
            case d: {
                if ((n2 >> 4 & 0xF) == 15) {
                    return -1;
                }
                return n2 + b;
            }
            case e: {
                if ((n2 >> 0 & 0xF) == 0) {
                    return -1;
                }
                return n2 - a;
            }
            case f: {
                if ((n2 >> 0 & 0xF) == 15) {
                    return -1;
                }
                return n2 + a;
            }
        }
        return -1;
    }

    static {
        boolean bl2 = false;
        int n2 = 15;
        int n3 = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    if (i2 != 0 && i2 != 15 && i3 != 0 && i3 != 15 && i4 != 0 && i4 != 15) continue;
                    apv.e[n3++] = apv.a(i2, i3, i4);
                }
            }
        }
    }
}

