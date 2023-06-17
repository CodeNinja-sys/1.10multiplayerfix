/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.dh;
import com.sun.jna.a.d.dz;
import com.sun.jna.a.d.ea;
import com.sun.jna.a.d.eb;
import com.sun.jna.a.d.ec;
import com.sun.jna.a.d.ed;
import com.sun.jna.a.d.ef;
import com.sun.jna.a.d.eg;
import com.sun.jna.a.d.eh;
import com.sun.jna.a.d.ei;
import com.sun.jna.a.d.ej;
import com.sun.jna.a.d.er;
import com.sun.jna.a.d.es;
import com.sun.jna.a.d.fb;
import com.sun.jna.a.d.fp;
import com.sun.jna.a.d.g;
import com.sun.jna.a.d.ge;
import com.sun.jna.a.d.gf;
import com.sun.jna.a.d.gg;
import com.sun.jna.a.d.gj;
import com.sun.jna.a.d.go;
import com.sun.jna.a.d.gp;
import com.sun.jna.a.d.gq;
import com.sun.jna.a.d.m;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.b.f;
import com.sun.jna.b.h;

public interface fw
extends dz,
er,
fp,
g {
    public static final int aEG = 65536;
    public static final int aEH = 131072;
    public static final int aEI = 262144;
    public static final int aEJ = 524288;
    public static final int aEK = 0x100000;
    public static final int aEL = 983040;
    public static final int aEM = 131072;
    public static final int aEN = 131072;
    public static final int aEO = 131072;
    public static final int aEP = 0x1F0000;
    public static final int aEQ = 65535;
    public static final int aER = 1;
    public static final int aES = 2;
    public static final int aET = 4;
    public static final int aEU = 8;
    public static final int aEV = 16;
    public static final int aEW = 32;
    public static final int aEX = 64;
    public static final int aEY = 128;
    public static final int aEZ = 256;
    public static final int aFa = 983295;
    public static final int aFb = 983551;
    public static final int aFc = 131080;
    public static final int aFd = 131296;
    public static final int aFe = 131072;
    public static final int aFf = 1;
    public static final int aFg = 2;
    public static final int aFh = 8;
    public static final int aFi = 16;
    public static final int aFj = 64;
    public static final int aFk = 32;
    public static final int aFl = 128;
    public static final int aFm = 256;
    public static final int aFn = 512;
    public static final int aFo = 1024;
    public static final int aFp = 2048;
    public static final int aFq = 2032639;
    public static final int aFr = 1;
    public static final int aFs = 1;
    public static final int aFt = 2;
    public static final int aFu = 2;
    public static final int aFv = 4;
    public static final int aFw = 4;
    public static final int aFx = 4;
    public static final int aFy = 8;
    public static final int aFz = 16;
    public static final int aFA = 32;
    public static final int aFB = 32;
    public static final int aFC = 64;
    public static final int aFD = 128;
    public static final int aFE = 256;
    public static final int aFF = 0x1F01FF;
    public static final int aFG = 1179785;
    public static final int aFH = 1179926;
    public static final int aFI = 1179808;
    public static final int aFJ = 1;
    public static final int aFK = 2;
    public static final int aFL = 3;
    public static final int aFM = 4;
    public static final int aFN = 5;
    public static final int aFO = Integer.MIN_VALUE;
    public static final int aFP = 0x40000000;
    public static final int aFQ = 0x20000000;
    public static final int aFR = 0x10000000;
    public static final int aFS = 0x8000000;
    public static final int aFT = 0x4000000;
    public static final int aFU = 0x2000000;
    public static final int aFV = 0x1000000;
    public static final int aFW = 0x200000;
    public static final int aFX = 0x100000;
    public static final int aFY = Integer.MIN_VALUE;
    public static final int aFZ = 0x40000000;
    public static final int aGa = 0x20000000;
    public static final int aGb = 0x10000000;
    public static final int aGc = 0x1000000;
    public static final int aGd = 2;
    public static final int aGe = 4;
    public static final int aGf = 8;
    public static final int aGg = 16;
    public static final int aGh = 32;
    public static final int aGi = 64;
    public static final int aGj = 1;
    public static final int aGk = 2;
    public static final int aGl = 4;
    public static final int aGm = 8;
    public static final int aGn = 16;
    public static final int aGo = 1;
    public static final int aGp = 2;
    public static final int aGq = 4;
    public static final int aGr = 1;
    public static final int aGs = 2;
    public static final int aGt = 4;
    public static final int aGu = 16;
    public static final int aGv = 32;
    public static final int aGw = 64;
    public static final int aGx = 128;
    public static final int aGy = 256;
    public static final int aGz = 512;
    public static final int aGA = 1024;
    public static final int aGB = 2048;
    public static final int aGC = 4096;
    public static final int aGD = 8192;
    public static final int aGE = 16384;
    public static final int aGF = 65536;
    public static final int aGG = 1;
    public static final int aGH = 2;
    public static final int aGI = 3;
    public static final int aGJ = 4;
    public static final int aGK = 8;
    public static final int aGL = 16;
    public static final int aGM = 32;
    public static final int aGN = 64;
    public static final int aGO = 256;
    public static final int aGP = 1;
    public static final int aGQ = 2;
    public static final int aGR = 3;
    public static final int aGS = 4;
    public static final int aGT = 5;
    public static final int aGU = 1;
    public static final int aGV = 2;
    public static final int aGW = 4;
    public static final int aGX = 8;
    public static final int aGY = 16;
    public static final int aGZ = 32;
    public static final int aHa = 64;
    public static final int aHb = 128;
    public static final int aHc = 256;
    public static final int aHd = 32768;
    public static final int aHe = 65536;
    public static final int aHf = 131072;
    public static final int aHg = 262144;
    public static final int aHh = 524288;
    public static final int aHi = 0x100000;
    public static final int aHj = 0x200000;
    public static final int aHk = 1;
    public static final int aHl = 2;
    public static final int aHm = 4;
    public static final int aHn = 8;
    public static final int aHo = 16;
    public static final int aHp = 32;
    public static final int aHq = 512;
    public static final int aHr = 256;
    public static final int aHs = 768;
    public static final int aHt = 131097;
    public static final int aHu = 131078;
    public static final int aHv = 131097;
    public static final int aHw = 2031679;
    public static final int aHx = 0;
    public static final int aHy = 0;
    public static final int aHz = 1;
    public static final int aHA = 2;
    public static final int aHB = 4;
    public static final int aHC = 8;
    public static final int aHD = 15;
    public static final int aHE = 1;
    public static final int aHF = 2;
    public static final int aHG = 1;
    public static final int aHH = 2;
    public static final int aHI = 4;
    public static final int aHJ = 1;
    public static final int aHK = 2;
    public static final int aHL = 4;
    public static final int aHM = 8;
    public static final int aHN = 16;
    public static final int aHO = 32;
    public static final int aHP = 64;
    public static final int aHQ = 128;
    public static final int aHR = 256;
    public static final int aHS = 512;
    public static final int aHT = 1;
    public static final int aHU = 1;
    public static final int aHV = 2;
    public static final int aHW = 4;
    public static final int aHX = 8;
    public static final int aHY = 15;
    public static final int aHZ = 0;
    public static final int aIa = 1;
    public static final int aIb = 2;
    public static final int aIc = 3;
    public static final int aId = 4;
    public static final int aIe = 4;
    public static final int aIf = 5;
    public static final int aIg = 6;
    public static final int aIh = 7;
    public static final int aIi = 8;
    public static final int aIj = 9;
    public static final int aIk = 10;
    public static final int aIl = 11;
    public static final int aIm = 11;
    public static final int aIn = 1;
    public static final int aIo = 15;
    public static final int aIp = 1;
    public static final int aIq = 68;
    public static final int aIr = 1;
    public static final int aIs = 2;
    public static final int aIt = 3;
    public static final int aIu = 4;
    public static final int aIv = 5;
    public static final int aIw = 6;
    public static final int aIx = 7;
    public static final int aIy = 7;
    public static final int aIz = 3;
    public static final int aIA = 1;
    public static final int aIB = 2;
    public static final int aIC = 4;
    public static final int aID = 8;
    public static final int aIE = 16;
    public static final int aIF = 32;
    public static final int aIG = 64;
    public static final int aIH = 128;
    public static final int aII = 1;
    public static final int aIJ = 2;
    public static final int aIK = 3;
    public static final int aIL = 0;
    public static final int aIM = 1;
    public static final int aIN = 2;
    public static final int aIO = 1;
    public static final int aIP = 2;
    public static final int aIQ = 4;
    public static final int aIR = 8;
    public static final int aIS = 0;
    public static final int aIT = 1;
    public static final int aIU = 2;
    public static final int aIV = 4;
    public static final int aIW = 8;
    public static final int aIX = 16;
    public static final int aIY = 1;
    public static final int aIZ = 2;
    public static final int aJa = 4;
    public static final int aJb = 8;
    public static final int aJc = 11;
    public static final int aJd = 16;
    public static final int aJe = 32;
    public static final int aJf = 48;
    public static final int aJg = 256;
    public static final int aJh = 319;
    public static final int aJi = 259;
    public static final String aJj = "SeCreateTokenPrivilege";
    public static final String aJk = "SeAssignPrimaryTokenPrivilege";
    public static final String aJl = "SeLockMemoryPrivilege";
    public static final String aJm = "SeIncreaseQuotaPrivilege";
    public static final String aJn = "SeUnsolicitedInputPrivilege";
    public static final String aJo = "SeMachineAccountPrivilege";
    public static final String aJp = "SeTcbPrivilege";
    public static final String aJq = "SeSecurityPrivilege";
    public static final String aJr = "SeTakeOwnershipPrivilege";
    public static final String aJs = "SeLoadDriverPrivilege";
    public static final String aJt = "SeSystemProfilePrivilege";
    public static final String aJu = "SeSystemtimePrivilege";
    public static final String aJv = "SeProfileSingleProcessPrivilege";
    public static final String aJw = "SeIncreaseBasePriorityPrivilege";
    public static final String aJx = "SeCreatePagefilePrivilege";
    public static final String aJy = "SeCreatePermanentPrivilege";
    public static final String aJz = "SeBackupPrivilege";
    public static final String aJA = "SeRestorePrivilege";
    public static final String aJB = "SeShutdownPrivilege";
    public static final String aJC = "SeDebugPrivilege";
    public static final String aJD = "SeAuditPrivilege";
    public static final String aJE = "SeSystemEnvironmentPrivilege";
    public static final String aJF = "SeChangeNotifyPrivilege";
    public static final String aJG = "SeRemoteShutdownPrivilege";
    public static final String aJH = "SeUndockPrivilege";
    public static final String aJI = "SeSyncAgentPrivilege";
    public static final String aJJ = "SeEnableDelegationPrivilege";
    public static final String aJK = "SeManageVolumePrivilege";
    public static final String aJL = "SeImpersonatePrivilege";
    public static final String aJM = "SeCreateGlobalPrivilege";
    public static final int aJN = 1;
    public static final int aJO = 2;
    public static final int aJP = 4;
    public static final int aJQ = Integer.MIN_VALUE;
    public static final int aJR = 1;
    public static final int aJS = 0x100000;
    public static final int aJT = 1;
    public static final int aJU = 2;
    public static final int aJV = 4;
    public static final int aJW = 8;
    public static final int aJX = 16;
    public static final int aJY = Integer.MIN_VALUE;
    public static final int aJZ = 0x40000000;
    public static final int aKa = 0x20000000;
    public static final int aKb = 0x10000000;
    public static final byte aKc = 0;
    public static final byte aKd = 1;
    public static final byte aKe = 2;
    public static final byte aKf = 3;
    public static final byte aKg = 4;
    public static final byte aKh = 5;
    public static final byte aKi = 6;
    public static final byte aKj = 7;
    public static final byte aKk = 8;
    public static final byte aKl = 9;
    public static final byte aKm = 10;
    public static final byte aKn = 11;
    public static final byte aKo = 12;
    public static final byte aKp = 13;
    public static final byte aKq = 14;
    public static final byte aKr = 15;
    public static final byte aKs = 16;
    public static final byte aKt = 17;
    public static final byte aKu = 1;
    public static final byte aKv = 2;
    public static final byte aKw = 4;
    public static final byte aKx = 8;
    public static final byte aKy = 16;
    public static final byte aKz = 31;

    public ay a(ay var1);

    public ay b(ay var1);

    public fb a(String var1);

    public void a(ei var1);

    public int a();

    public int b();

    public gf c();

    public int d();

    public gf e();

    public int a(gf var1);

    public int a(int var1);

    public boolean a(gf var1, e var2);

    public boolean a(gf var1, int var2);

    public int f();

    public void b(int var1);

    public int b(String var1);

    public int a(int var1, ay var2, int var3, int var4, ay var5, int var6, ay var7);

    public int a(int var1, ay var2, int var3, int var4, h var5, int var6, ay var7);

    public gf a(String var1, int var2, int var3, eg var4, int var5, int var6, gf var7);

    public boolean a(String var1, String var2, boolean var3);

    public boolean a(String var1, String var2);

    public boolean a(String var1, String var2, es var3);

    public boolean a(String var1, eg var2);

    public boolean a(gf var1, ay var2, int var3, e var4, ed var5);

    public gf a(gf var1, gf var2, ay var3, int var4);

    public boolean a(gf var1, e var2, m var3, h var4, int var5);

    public boolean a(gf var1, int var2, ay var3, ed var4);

    public int b(gf var1, int var2);

    public int a(int var1, gf[] var2, boolean var3, int var4);

    public boolean a(gf var1, gf var2, gf var3, gg var4, int var5, boolean var6, int var7);

    public boolean b(gf var1);

    public boolean a(gf var1, ge var2, int var3, boolean var4, int var5, e var6, ed var7, gq var8);

    public int a(String var1, char[] var2, int var3);

    public ay a(int var1, int var2);

    public boolean a(gf var1, byte[] var2, int var3, e var4, ed var5);

    public gf a(eg var1, boolean var2, boolean var3, String var4);

    public boolean c(gf var1);

    public boolean d(gf var1);

    public gf a(gf var1, eg var2, int var3, int var4, int var5, String var6);

    public ay a(gf var1, int var2, int var3, int var4, int var5);

    public boolean c(ay var1);

    public boolean a(char[] var1, e var2);

    public gf a(int var1, boolean var2, int var3);

    public boolean a(String var1, String var2, eg var3, eg var4, boolean var5, es var6, ay var7, String var8, eh var9, ef var10);

    public gf b(int var1, boolean var2, int var3);

    public es a(es var1, char[] var2);

    public boolean b(String var1, String var2);

    public es g();

    public boolean a(go var1);

    public boolean a(gp var1);

    public void a(ej var1);

    public void b(ej var1);

    public boolean b(gf var1, e var2);

    public boolean a(ec var1);

    public boolean a(gf var1, eb var2, eb var3, eb var4);

    public int a(gf var1, ea var2, ea var3, ea var4);

    public boolean a(String var1, es var2);

    public es b(es var1, char[] var2);

    public boolean a(String var1, gj var2, gj var3, gj var4);

    public boolean c(String var1);

    public boolean a(gg var1, gg var2, eg var3, int var4);

    public boolean a(gf var1, int var2, int var3);

    public int d(String var1);

    public boolean a(gf var1, int var2, ay var3, int var4, ay var5, int var6, e var7, ay var8);

    public boolean a(String var1, f var2, f var3, f var4);

    public gf a(es var1, es var2);

    public boolean a(gf var1, dh var2);

    public boolean b(gf var1, dh var2);
}

