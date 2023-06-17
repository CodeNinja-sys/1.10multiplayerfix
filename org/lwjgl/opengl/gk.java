/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.fp;

final class gk
extends fp
implements KeyListener {
    private static final int[] a = new int[65535];
    private final byte[] b = new byte[256];
    private final ByteBuffer c = ByteBuffer.allocate(18);
    private final Component d;
    private boolean e;
    private long f;
    private int g;
    private int h;
    private byte i;
    private int j;

    gk(Component component) {
        super(18);
        this.d = component;
    }

    public void b() {
        this.d.addKeyListener(this);
    }

    public void c() {
    }

    private void a(int n2, byte by2, int n3, long l2, boolean bl2) {
        this.c.clear();
        this.c.putInt(n2).put(by2).putInt(n3).putLong(l2).put(bl2 ? (byte)1 : 0);
        this.c.flip();
        this.b(this.c);
    }

    public synchronized void c(ByteBuffer byteBuffer) {
        this.d();
        int n2 = byteBuffer.position();
        byteBuffer.put(this.b);
        byteBuffer.position(n2);
    }

    public synchronized void a(ByteBuffer byteBuffer) {
        this.d();
        super.a(byteBuffer);
    }

    private synchronized void a(int n2, int n3, byte by2, int n4, long l2) {
        if (n4 == 65535) {
            n4 = 0;
        }
        if (by2 == 1) {
            boolean bl2 = false;
            if (this.e) {
                if (l2 == this.f && this.g == n2 && this.h == n3) {
                    this.e = false;
                    bl2 = true;
                } else {
                    this.d();
                }
            }
            this.a(n2, n3, by2, n4, l2, bl2);
        } else {
            this.d();
            this.e = true;
            this.f = l2;
            this.g = n2;
            this.h = n3;
            this.i = by2;
            this.j = n4;
        }
    }

    private void d() {
        if (this.e) {
            this.a(this.g, this.h, this.i, this.j, this.f, false);
            this.e = false;
        }
    }

    private void a(int n2, int n3, byte by2, int n4, long l2, boolean bl2) {
        int n5 = this.a(n2, n3);
        if (this.b[n5] == by2) {
            bl2 = true;
        }
        this.b[n5] = by2;
        int n6 = n4 & 0xFFFF;
        this.a(n5, by2, n6, l2, bl2);
    }

    private int a(int n2, int n3) {
        switch (n2) {
            case 18: {
                if (n3 == 3) {
                    return 184;
                }
                return 56;
            }
            case 157: {
                if (n3 == 3) {
                    return 220;
                }
                return 219;
            }
            case 16: {
                if (n3 == 3) {
                    return 54;
                }
                return 42;
            }
            case 17: {
                if (n3 == 3) {
                    return 157;
                }
                return 29;
            }
        }
        return a[n2];
    }

    public void keyPressed(KeyEvent keyEvent) {
        this.a(keyEvent.getKeyCode(), keyEvent.getKeyLocation(), (byte)1, keyEvent.getKeyChar(), keyEvent.getWhen() * 1000000L);
    }

    public void keyReleased(KeyEvent keyEvent) {
        this.a(keyEvent.getKeyCode(), keyEvent.getKeyLocation(), (byte)0, 0, keyEvent.getWhen() * 1000000L);
    }

    public void keyTyped(KeyEvent keyEvent) {
    }

    static {
        gk.a[48] = 11;
        gk.a[49] = 2;
        gk.a[50] = 3;
        gk.a[51] = 4;
        gk.a[52] = 5;
        gk.a[53] = 6;
        gk.a[54] = 7;
        gk.a[55] = 8;
        gk.a[56] = 9;
        gk.a[57] = 10;
        gk.a[65] = 30;
        gk.a[107] = 78;
        gk.a[65406] = 184;
        gk.a[512] = 145;
        gk.a[66] = 48;
        gk.a[92] = 43;
        gk.a[8] = 14;
        gk.a[67] = 46;
        gk.a[20] = 58;
        gk.a[514] = 144;
        gk.a[93] = 27;
        gk.a[513] = 146;
        gk.a[44] = 51;
        gk.a[28] = 121;
        gk.a[68] = 32;
        gk.a[110] = 83;
        gk.a[127] = 211;
        gk.a[111] = 181;
        gk.a[40] = 208;
        gk.a[69] = 18;
        gk.a[35] = 207;
        gk.a[10] = 28;
        gk.a[61] = 13;
        gk.a[27] = 1;
        gk.a[70] = 33;
        gk.a[112] = 59;
        gk.a[121] = 68;
        gk.a[122] = 87;
        gk.a[123] = 88;
        gk.a[61440] = 100;
        gk.a[61441] = 101;
        gk.a[61442] = 102;
        gk.a[113] = 60;
        gk.a[114] = 61;
        gk.a[115] = 62;
        gk.a[116] = 63;
        gk.a[117] = 64;
        gk.a[118] = 65;
        gk.a[119] = 66;
        gk.a[120] = 67;
        gk.a[71] = 34;
        gk.a[72] = 35;
        gk.a[36] = 199;
        gk.a[73] = 23;
        gk.a[155] = 210;
        gk.a[74] = 36;
        gk.a[75] = 37;
        gk.a[21] = 112;
        gk.a[25] = 148;
        gk.a[76] = 38;
        gk.a[37] = 203;
        gk.a[77] = 50;
        gk.a[45] = 12;
        gk.a[106] = 55;
        gk.a[78] = 49;
        gk.a[144] = 69;
        gk.a[96] = 82;
        gk.a[97] = 79;
        gk.a[98] = 80;
        gk.a[99] = 81;
        gk.a[100] = 75;
        gk.a[101] = 76;
        gk.a[102] = 77;
        gk.a[103] = 71;
        gk.a[104] = 72;
        gk.a[105] = 73;
        gk.a[79] = 24;
        gk.a[91] = 26;
        gk.a[80] = 25;
        gk.a[34] = 209;
        gk.a[33] = 201;
        gk.a[19] = 197;
        gk.a[46] = 52;
        gk.a[81] = 16;
        gk.a[82] = 19;
        gk.a[39] = 205;
        gk.a[83] = 31;
        gk.a[145] = 70;
        gk.a[59] = 39;
        gk.a[108] = 83;
        gk.a[47] = 53;
        gk.a[32] = 57;
        gk.a[65480] = 149;
        gk.a[109] = 74;
        gk.a[84] = 20;
        gk.a[9] = 15;
        gk.a[85] = 22;
        gk.a[38] = 200;
        gk.a[86] = 47;
        gk.a[87] = 17;
        gk.a[88] = 45;
        gk.a[89] = 21;
        gk.a[90] = 44;
    }
}

