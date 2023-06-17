/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.iv;

public final class lb
implements iv {
    private int an = 0;
    private int[] ao = new int[8];
    private int ap = 0;
    private static final int aq = 3;
    private byte[] ar = new byte[3];
    private int as = 0;

    public lb() {
        this.a();
    }

    public static String a(byte[] arrby) {
        char[] arrc = lb.a(arrby, 0, arrby.length);
        return new String(arrc);
    }

    public static char[] a(byte[] arrby, int n2, int n3) {
        lb lb2 = new lb();
        int n4 = Math.max(2, 2 * (n3 - n2));
        char[] arrc = new char[n4];
        int n5 = lb2.a(arrby, n2, n3, null, arrc, 0, n4);
        char[] arrc2 = new char[n5];
        System.arraycopy(arrc, 0, arrc2, 0, n5);
        return arrc2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(byte[] arrby, int n2, int n3, int[] arrn, char[] arrc, int n4, int n5) {
        int n6;
        int n7 = n2;
        int n8 = n4;
        int n9 = 0;
        if (arrc.length < 2 || n5 - n4 < 2) {
            throw new IllegalArgumentException("charBuffer.length < 2");
        }
        if (this.as > 0) {
            n6 = 0;
            if (this.as != 3) {
                n6 = this.ar.length - this.as;
                if (n3 - n2 < n6) {
                    n6 = n3 - n2;
                }
                System.arraycopy(arrby, n2, this.ar, this.as, n6);
            }
            this.as = 0;
            int n10 = this.a(this.ar, 0, this.ar.length, null, arrc, n4, n5);
            n8 += n10;
            n7 += n6;
        }
        block20: while (n7 < n3 && n8 < n5) {
            block38: {
                block39: {
                    switch (this.ap) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            break block39;
                        }
                    }
                    while (n7 < n3 && n8 < n5) {
                        n9 = arrby[n7++] & 0xFF;
                        switch (n9) {
                            case 128: 
                            case 129: 
                            case 130: 
                            case 131: 
                            case 132: 
                            case 133: 
                            case 134: 
                            case 135: 
                            case 136: 
                            case 137: 
                            case 138: 
                            case 139: 
                            case 140: 
                            case 141: 
                            case 142: 
                            case 143: 
                            case 144: 
                            case 145: 
                            case 146: 
                            case 147: 
                            case 148: 
                            case 149: 
                            case 150: 
                            case 151: 
                            case 152: 
                            case 153: 
                            case 154: 
                            case 155: 
                            case 156: 
                            case 157: 
                            case 158: 
                            case 159: 
                            case 160: 
                            case 161: 
                            case 162: 
                            case 163: 
                            case 164: 
                            case 165: 
                            case 166: 
                            case 167: 
                            case 168: 
                            case 169: 
                            case 170: 
                            case 171: 
                            case 172: 
                            case 173: 
                            case 174: 
                            case 175: 
                            case 176: 
                            case 177: 
                            case 178: 
                            case 179: 
                            case 180: 
                            case 181: 
                            case 182: 
                            case 183: 
                            case 184: 
                            case 185: 
                            case 186: 
                            case 187: 
                            case 188: 
                            case 189: 
                            case 190: 
                            case 191: 
                            case 192: 
                            case 193: 
                            case 194: 
                            case 195: 
                            case 196: 
                            case 197: 
                            case 198: 
                            case 199: 
                            case 200: 
                            case 201: 
                            case 202: 
                            case 203: 
                            case 204: 
                            case 205: 
                            case 206: 
                            case 207: 
                            case 208: 
                            case 209: 
                            case 210: 
                            case 211: 
                            case 212: 
                            case 213: 
                            case 214: 
                            case 215: 
                            case 216: 
                            case 217: 
                            case 218: 
                            case 219: 
                            case 220: 
                            case 221: 
                            case 222: 
                            case 223: 
                            case 224: 
                            case 225: 
                            case 226: 
                            case 227: 
                            case 228: 
                            case 229: 
                            case 230: 
                            case 231: 
                            case 232: 
                            case 233: 
                            case 234: 
                            case 235: 
                            case 236: 
                            case 237: 
                            case 238: 
                            case 239: 
                            case 240: 
                            case 241: 
                            case 242: 
                            case 243: 
                            case 244: 
                            case 245: 
                            case 246: 
                            case 247: 
                            case 248: 
                            case 249: 
                            case 250: 
                            case 251: 
                            case 252: 
                            case 253: 
                            case 254: 
                            case 255: {
                                if (this.ao[this.an] <= 65535) {
                                    arrc[n8++] = (char)(n9 + this.ao[this.an] - 128);
                                    break;
                                }
                                if (n8 + 1 >= n5) {
                                    System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                    this.as = n3 - n7;
                                    n7 += this.as;
                                    break block20;
                                }
                                n6 = this.ao[this.an] - 65536;
                                arrc[n8++] = (char)(55296 + (n6 >> 10));
                                arrc[n8++] = (char)(56320 + (n6 & 0x3FF) + (n9 & 0x7F));
                                break;
                            }
                            case 0: 
                            case 9: 
                            case 10: 
                            case 13: 
                            case 32: 
                            case 33: 
                            case 34: 
                            case 35: 
                            case 36: 
                            case 37: 
                            case 38: 
                            case 39: 
                            case 40: 
                            case 41: 
                            case 42: 
                            case 43: 
                            case 44: 
                            case 45: 
                            case 46: 
                            case 47: 
                            case 48: 
                            case 49: 
                            case 50: 
                            case 51: 
                            case 52: 
                            case 53: 
                            case 54: 
                            case 55: 
                            case 56: 
                            case 57: 
                            case 58: 
                            case 59: 
                            case 60: 
                            case 61: 
                            case 62: 
                            case 63: 
                            case 64: 
                            case 65: 
                            case 66: 
                            case 67: 
                            case 68: 
                            case 69: 
                            case 70: 
                            case 71: 
                            case 72: 
                            case 73: 
                            case 74: 
                            case 75: 
                            case 76: 
                            case 77: 
                            case 78: 
                            case 79: 
                            case 80: 
                            case 81: 
                            case 82: 
                            case 83: 
                            case 84: 
                            case 85: 
                            case 86: 
                            case 87: 
                            case 88: 
                            case 89: 
                            case 90: 
                            case 91: 
                            case 92: 
                            case 93: 
                            case 94: 
                            case 95: 
                            case 96: 
                            case 97: 
                            case 98: 
                            case 99: 
                            case 100: 
                            case 101: 
                            case 102: 
                            case 103: 
                            case 104: 
                            case 105: 
                            case 106: 
                            case 107: 
                            case 108: 
                            case 109: 
                            case 110: 
                            case 111: 
                            case 112: 
                            case 113: 
                            case 114: 
                            case 115: 
                            case 116: 
                            case 117: 
                            case 118: 
                            case 119: 
                            case 120: 
                            case 121: 
                            case 122: 
                            case 123: 
                            case 124: 
                            case 125: 
                            case 126: 
                            case 127: {
                                arrc[n8++] = (char)n9;
                                break;
                            }
                            case 14: {
                                if (n7 + 1 >= n3) {
                                    System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                    this.as = n3 - n7;
                                    n7 += this.as;
                                    break block20;
                                }
                                n9 = arrby[n7++];
                                arrc[n8++] = (char)(n9 << 8 | arrby[n7++] & 0xFF);
                                break;
                            }
                            case 15: {
                                this.ap = 1;
                                break block38;
                            }
                            case 1: 
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: 
                            case 6: 
                            case 7: 
                            case 8: {
                                if (n7 >= n3) {
                                    System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                    this.as = n3 - n7;
                                    n7 += this.as;
                                    break block20;
                                }
                                n6 = arrby[n7++] & 0xFF;
                                arrc[n8++] = (char)(n6 + (n6 >= 0 && n6 < 128 ? am[n9 - 1] : this.ao[n9 - 1] - 128));
                                break;
                            }
                            case 16: 
                            case 17: 
                            case 18: 
                            case 19: 
                            case 20: 
                            case 21: 
                            case 22: 
                            case 23: {
                                this.an = n9 - 16;
                                break;
                            }
                            case 24: 
                            case 25: 
                            case 26: 
                            case 27: 
                            case 28: 
                            case 29: 
                            case 30: 
                            case 31: {
                                if (n7 >= n3) {
                                    System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                    this.as = n3 - n7;
                                    n7 += this.as;
                                    break block20;
                                }
                                this.an = n9 - 24;
                                this.ao[this.an] = al[arrby[n7++] & 0xFF];
                                break;
                            }
                            case 11: {
                                if (n7 + 1 >= n3) {
                                    System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                    this.as = n3 - n7;
                                    n7 += this.as;
                                    break block20;
                                }
                                n9 = arrby[n7++] & 0xFF;
                                this.an = (n9 & 0xE0) >> 5;
                                this.ao[this.an] = 65536 + 128 * ((n9 & 0x1F) << 8 | arrby[n7++] & 0xFF);
                                break;
                            }
                        }
                    }
                    break block38;
                }
                block22: while (n7 < n3 && n8 < n5) {
                    n9 = arrby[n7++] & 0xFF;
                    switch (n9) {
                        case 232: 
                        case 233: 
                        case 234: 
                        case 235: 
                        case 236: 
                        case 237: 
                        case 238: 
                        case 239: {
                            if (n7 >= n3) {
                                System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                this.as = n3 - n7;
                                n7 += this.as;
                                break block20;
                            }
                            this.an = n9 - 232;
                            this.ao[this.an] = al[arrby[n7++] & 0xFF];
                            this.ap = 0;
                            break block22;
                        }
                        case 241: {
                            if (n7 + 1 >= n3) {
                                System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                this.as = n3 - n7;
                                n7 += this.as;
                                break block20;
                            }
                            n9 = arrby[n7++] & 0xFF;
                            this.an = (n9 & 0xE0) >> 5;
                            this.ao[this.an] = 65536 + 128 * ((n9 & 0x1F) << 8 | arrby[n7++] & 0xFF);
                            this.ap = 0;
                            break block22;
                        }
                        case 224: 
                        case 225: 
                        case 226: 
                        case 227: 
                        case 228: 
                        case 229: 
                        case 230: 
                        case 231: {
                            this.an = n9 - 224;
                            this.ap = 0;
                            break block22;
                        }
                        case 240: {
                            if (n7 >= n3 - 1) {
                                System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                this.as = n3 - n7;
                                n7 += this.as;
                                break block20;
                            }
                            n9 = arrby[n7++];
                            arrc[n8++] = (char)(n9 << 8 | arrby[n7++] & 0xFF);
                            continue block22;
                        }
                        default: {
                            if (n7 >= n3) {
                                System.arraycopy(arrby, --n7, this.ar, 0, n3 - n7);
                                this.as = n3 - n7;
                                n7 += this.as;
                                break block20;
                            }
                            arrc[n8++] = (char)(n9 << 8 | arrby[n7++] & 0xFF);
                            continue block22;
                        }
                    }
                }
            }
        }
        if (arrn != null) {
            arrn[0] = n7 - n2;
        }
        return n8 - n4;
    }

    public void a() {
        this.ao[0] = 128;
        this.ao[1] = 192;
        this.ao[2] = 1024;
        this.ao[3] = 1536;
        this.ao[4] = 2304;
        this.ao[5] = 12352;
        this.ao[6] = 12448;
        this.ao[7] = 65280;
        this.an = 0;
        this.ap = 0;
        this.as = 0;
    }
}

