/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.a;

final class b {
    final boolean[] a = new boolean[256];
    final byte[] b = new byte[256];
    final byte[] c = new byte[18002];
    final byte[] d = new byte[18002];
    final int[] e = new int[256];
    final int[][] f = new int[6][258];
    final int[][] g = new int[6][258];
    final int[][] h = new int[6][258];
    final int[] i = new int[6];
    final int[] j = new int[257];
    final char[] k = new char[256];
    final char[][] l = new char[6][258];
    final byte[] m = new byte[6];
    int[] n;
    byte[] o;

    b(int n2) {
        this.o = new byte[n2 * 100000];
    }

    int[] a(int n2) {
        int[] arrn = this.n;
        if (arrn == null || arrn.length < n2) {
            this.n = arrn = new int[n2];
        }
        return arrn;
    }
}

