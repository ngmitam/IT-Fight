import java.io.*;

public class Manager {
    /* xuat file */
    private FileOutputStream is;
    private OutputStreamWriter osw;
    private Writer w;
    private FileWriter fw;

    /* VT */
    private int VT;

    /* SP */
    private int SP[];

    /* may 1 */
    private int machine_1_x0;
    private int machine_1_y0;
    private int machine_1_x;
    private int machine_1_y;

    /* may 2 */
    private int machine_2_x0;
    private int machine_2_y0;
    private int machine_2_x;
    private int machine_2_y;

    /* may 3 */
    private int machine_3_x0;
    private int machine_3_y0;
    private int machine_3_x;
    private int machine_3_y;

    /* may 4 */
    private int machine_4_x0;
    private int machine_4_y0;
    private int machine_4_x;
    private int machine_4_y;

    /* robot */
    private int[] robot_x0;
    private int[] robot_y0;
    private int robot_x;
    private int robot_y;

    /* red */
    private int[] red_x0;
    private int[] red_y0;
    private int red_x;
    private int red_y;

    /* orange */
    private int[] orange_x0;
    private int[] orange_y0;
    private int orange_x;
    private int orange_y;

    /* yellow */
    private int[] yellow_x0;
    private int[] yellow_y0;
    private int yellow_x;
    private int yellow_y;

    /* yellowgreen */
    private int[] yellowgreen_x0;
    private int[] yellowgreen_y0;
    private int yellowgreen_x;
    private int yellowgreen_y;

    /* lightblue */
    private int[] lightblue_x0;
    private int[] lightblue_y0;
    private int lightblue_x;
    private int lightblue_y;

    /* brown */
    private int[] brown_x0;
    private int[] brown_y0;
    private int brown_x;
    private int brown_y;

    /* text */
    private int[] text_x;
    private int[] text_y;

    /* player */
    private int player_score;
    private int player_a;
    private int player_b;
    private int player_c;
    private int player_d;
    private int player_e;
    private int player_limit_a;
    private int player_limit_b;
    private int player_limit_c;
    private int player_limit_d;
    private int player_limit_e;

    /* SP */
    private int[] SP_id;
    private int[] SP_a;
    private int[] SP_b;
    private int[] SP_c;
    private int[] SP_d;
    private int[] SP_e;
    private int[] SP_score;

    private String setScence(int a, int b, int c, int d, int e, int f, int g, int h, int i, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t, int u, int w, int x, int y, int z, int aa, int ab, int ac, int ad, int ae, int af, int ag, int ah, int ai, int ak, int al, int am, int an, int ao, int ap, int aq, int ar, int as, int at, int au, String aw, int ax, int ay, int az, int ba, int bb, int bc, int bd, int be, int bf, int bg, int bh, int bi, int bk, int bl, int bm, int bn, int bo, int bp, int bq, int br, int bs, int bt, int bu, int bw, int bv, int bx, int by, int bz, int ca, int cb, int cc, int cd, int ce, int cf, int cg, int ch, int ci) {
        return "{" + "\"a\":\"" + a + "\"," + "\"b\":\"" + b + "\"," + "\"c\":\"" + c + "\"," + "\"d\":\"" + d + "\"," + "\"e\":\"" + e + "\"," + "\"f\":\"" + f + "\"," + "\"g\":\"" + g + "\"," + "\"h\":\"" + h + "\"," + "\"i\":\"" + i + "\"," + "\"k\":\"" + k + "\"," + "\"l\":\"" + l + "\"," + "\"m\":\"" + m + "\"," + "\"n\":\"" + n + "\"," + "\"o\":\"" + o + "\"," + "\"p\":\"" + p + "\"," + "\"q\":\"" + q + "\"," + "\"r\":\"" + r + "\"," + "\"s\":\"" + s + "\"," + "\"t\":\"" + t + "\"," + "\"u\":\"" + u + "\"," + "\"w\":\"" + w + "\"," + "\"x\":\"" + x + "\"," + "\"y\":\"" + y + "\"," + "\"z\":\"" + z + "\"," + "\"aa\":\"" + aa + "\"," + "\"ab\":\"" + ab + "\"," + "\"ac\":\"" + ac + "\"," + "\"ad\":\"" + ad + "\"," + "\"ae\":\"" + ae + "\"," + "\"af\":\"" + af + "\"," + "\"ag\":\"" + ag + "\"," + "\"ah\":\"" + ah + "\"," + "\"ai\":\"" + ai + "\"," + "\"ak\":\"" + ak + "\"," + "\"al\":\"" + al + "\"," + "\"am\":\"" + am + "\"," + "\"an\":\"" + an + "\"," + "\"ao\":\"" + ao + "\"," + "\"ap\":\"" + ap + "\"," + "\"aq\":\"" + aq + "\"," + "\"ar\":\"" + ar + "\"," + "\"as\":\"" + as + "\"," + "\"at\":\"" + at + "\"," + "\"au\":\"" + au + "\"," + "\"aw\":\"" + aw + "\"," + "\"ax\":\"" + ax + "\"," + "\"ay\":\"" + ay + "\"," + "\"az\":\"" + az + "\"," + "\"ba\":\"" + ba + "\"," + "\"bb\":\"" + bb + "\"," + "\"bc\":\"" + bc + "\"," + "\"bd\":\"" + bd + "\"," + "\"be\":\"" + be + "\"," + "\"bf\":\"" + bf + "\"," + "\"bg\":\"" + bg + "\"," + "\"bh\":\"" + bh + "\"," + "\"bi\":\"" + bi + "\"," + "\"bk\":\"" + bk + "\"," + "\"bl\":\"" + bl + "\"," + "\"bm\":\"" + bm + "\"," + "\"bn\":\"" + bn + "\"," + "\"bo\":\"" + bo + "\"," + "\"bp\":\"" + bp + "\"," + "\"bq\":\"" + bq + "\"," + "\"br\":\"" + br + "\"," + "\"bs\":\"" + bs + "\"," + "\"bt\":\"" + bt + "\"," + "\"bu\":\"" + bu + "\"," + "\"bw\":\"" + bw + "\"," + "\"bv\":\"" + bv + "\"," + "\"bx\":\"" + bx + "\"," + "\"by\":\"" + by + "\"," + "\"bz\":\"" + bz + "\"," + "\"ca\":\"" + ca + "\"," + "\"cb\":\"" + cb + "\"," + "\"cc\":\"" + cc + "\"," + "\"cd\":\"" + cd + "\"," + "\"ce\":\"" + ce + "\"," + "\"cf\":\"" + cf + "\"," + "\"cg\":\"" + cg + "\"," + "\"ch\":\"" + ch + "\"," + "\"ci\":\"" + ci + "\"" + "},";
    }
    
    /* Tra ve vi tri hien tai 
     * 0:
     * 1:
     * 2:
     * 3:
     */
    
    private int layVTSanPhamByID(int id) {
    	for (int i = 0; i < 5; ++i) {
            if (SP_id[i] == id) {
                return i;
            }
        }
    	
    	return -1;
    }

    public int layViTri() {
        return VT;
    }

    /* Tra ve ID san pham tai vi tri vt 
     * Tra ve -1 neu vt khong hop le 
     */
    
    public int layIDSanPham(int vt) {
        if (0 <= vt && vt < 5) {
            return SP_id[vt];
        }
        return -1;
    }
    
    /* Tra ve so luong nguyen_lieu của san pham co id_SP 
     * Tra ve -1 neu khong hop le 
     */
    
    public int layThongTin(int id_SP, int nguyen_lieu) {
        for (int i = 0; i < 5; ++i) {
            if (SP_id[i] == id_SP) {
                switch (nguyen_lieu) {
                    case 0: return SP_a[i];
                    case 1: return SP_b[i];
                    case 2: return SP_c[i];
                    case 3: return SP_d[i];
                    case 4: return SP_e[i];
                    default: return -1;
                }
            }
        }

        return -1;
    }
    
    /* Tra ve trang cua san pham co id la id_SP
     * -2:	loi
     * -1:	chua duoc chon
     * 0:	da chon
     * 1:	da xong
     */

    public int layTrangThaiSanPham(int id_SP) {

        for (int i = 0; i < 5; ++i) {
            if (SP_id[i] == id_SP) {
                return SP[i];
            }
        }

        return -2;
    }
    
    /* Tra ve so luong nguyen nguyen lieu con lai
     * Tra ve -1 neu co loi
     */
    
    public int laySoLuongNguyenLieuConLai(int nguyen_lieu) {
    	if (0 <= nguyen_lieu && nguyen_lieu < 5) {
    		switch (nguyen_lieu) {
	            case 0: return SP_a[4];
	            case 1: return SP_b[4];
	            case 2: return SP_c[4];
	            case 3: return SP_d[4];
	            case 4: return SP_e[4];
	            default: return -1;
    		}
    	}
    	
    	return -1;
    }
    
    /* Tra ve so luong nguyen nguyen lieu dang mang
     * Tra ve -1 neu co loi
     */
    
    public int laySoLuongNguyenLieuDangMang(int nguyen_lieu) {
    	if (0 <= nguyen_lieu && nguyen_lieu < 5) {
    		switch (nguyen_lieu) {
	            case 0: return player_a;
	            case 1: return player_b;
	            case 2: return player_c;
	            case 3: return player_d;
	            case 4: return player_e;
	            default: return -1;
    		}
    	}
    	
    	return -1;
    }
    
    /* Tra ve gioi han so luong nguyen nguyen lieu
     * Tra ve -1 neu co loi
     */
    
    public int layGioiHanSoLuongNguyenLieu(int nguyen_lieu) {
    	if (0 <= nguyen_lieu && nguyen_lieu < 5) {
    		switch (nguyen_lieu) {
	            case 0: return player_limit_a;
	            case 1: return player_limit_b;
	            case 2: return player_limit_c;
	            case 3: return player_limit_d;
	            case 4: return player_limit_e;
	            default: return -1;
    		}
    	}
    	
    	return -1;
    }
    
    public Manager() {
        SP = new int[5];
        SP[0] = -1;
        SP[1] = -1;
        SP[2] = -1;
        SP[3] = -1;
        SP[4] = 1;

        VT = 3;
        
        machine_1_x0 = -200;
        machine_1_y0 = 100;
        machine_1_x = 400;
        machine_1_y = 400;

        machine_2_x0 = 250;
        machine_2_y0 = 300;
        machine_2_x = 400;
        machine_2_y = 400;

        machine_3_x0 = 700;
        machine_3_y0 = 100;
        machine_3_x = 400;
        machine_3_y = 400;

        machine_4_x0 = 250;
        machine_4_y0 = 0;
        machine_4_x = 400;
        machine_4_y = 400;

        robot_x0 = new int[4];
        robot_y0 = new int[4];
        robot_x0[0] = -100;
        robot_y0[0] = 120;
        robot_x0[1] = 300;
        robot_y0[1] = 330;
        robot_x0[2] = 700;
        robot_y0[2] = 130;
        robot_x0[3] = 300;
        robot_y0[3] = 80;
        robot_x = 300;
        robot_y = 300;

        red_x0 = new int[7];
        red_y0 = new int[7];
        red_x0[0] = -50;
        red_y0[0] = -50;
        red_x0[1] = 425;
        red_y0[1] = 400;
        red_x0[2] = 425;
        red_y0[2] = 300;
        red_x0[1] = 425;
        red_y0[1] = 400;
        red_x0[2] = 425;
        red_y0[2] = 300;
        red_x0[3] = 375;
        red_y0[3] = 30;
        red_x0[4] = 425;
        red_y0[4] = 30;
        red_x0[5] = 425;
        red_y0[5] = 30;
        red_x0[6] = 475;
        red_y0[6] = 30;
        red_x = 50;
        red_y = 50;

        orange_x0 = new int[7];
        orange_y0 = new int[7];
        orange_x0[0] = -50;
        orange_y0[0] = -50;
        orange_x0[1] = 425;
        orange_y0[1] = 400;
        orange_x0[2] = 425;
        orange_y0[2] = 300;
        orange_x0[3] = 375;
        orange_y0[3] = 30;
        orange_x0[4] = 425;
        orange_y0[4] = 30;
        orange_x0[5] = 425;
        orange_y0[5] = 30;
        orange_x0[6] = 475;
        orange_y0[6] = 30;
        orange_x = 50;
        orange_y = 50;

        yellow_x0 = new int[7];
        yellow_y0 = new int[7];
        yellow_x0[0] = -50;
        yellow_y0[0] = -50;
        yellow_x0[1] = 425;
        yellow_y0[1] = 400;
        yellow_x0[2] = 425;
        yellow_y0[2] = 300;
        yellow_x0[3] = 375;
        yellow_y0[3] = 30;
        yellow_x0[4] = 425;
        yellow_y0[4] = 30;
        yellow_x0[5] = 425;
        yellow_y0[5] = 30;
        yellow_x0[6] = 475;
        yellow_y0[6] = 30;
        yellow_x = 50;
        yellow_y = 50;

        yellowgreen_x0 = new int[7];
        yellowgreen_y0 = new int[7];
        yellowgreen_x0[0] = -50;
        yellowgreen_y0[0] = -50;
        yellowgreen_x0[1] = 425;
        yellowgreen_y0[1] = 400;
        yellowgreen_x0[2] = 425;
        yellowgreen_y0[2] = 300;
        yellowgreen_x0[3] = 375;
        yellowgreen_y0[3] = 30;
        yellowgreen_x0[4] = 425;
        yellowgreen_y0[4] = 30;
        yellowgreen_x0[5] = 425;
        yellowgreen_y0[5] = 30;
        yellowgreen_x0[6] = 475;
        yellowgreen_y0[6] = 30;
        yellowgreen_x = 50;
        yellowgreen_y = 50;

        lightblue_x0 = new int[7];
        lightblue_y0 = new int[7];
        lightblue_x0[0] = -50;
        lightblue_y0[0] = -50;
        lightblue_x0[1] = 425;
        lightblue_y0[1] = 400;
        lightblue_x0[2] = 425;
        lightblue_y0[2] = 300;
        lightblue_x0[3] = 375;
        lightblue_y0[3] = 30;
        lightblue_x0[4] = 425;
        lightblue_y0[4] = 30;
        lightblue_x0[5] = 425;
        lightblue_y0[5] = 30;
        lightblue_x0[6] = 475;
        lightblue_y0[6] = 30;
        lightblue_x = 50;
        lightblue_y = 50;

        brown_x0 = new int[5];
        brown_y0 = new int[5];
        brown_x0[0] = -50;
        brown_y0[0] = -50;
        brown_x0[1] = 0;
        brown_y0[1] = 200;
        brown_x0[2] = 0;
        brown_y0[2] = 100;
        brown_x0[3] = 850;
        brown_y0[3] = 200;
        brown_x0[4] = 850;
        brown_y0[4] = 100;
        brown_x = 50;
        brown_y = 50;

        text_x = new int[5];
        text_y = new int[5];
        text_x[0] = 0;
        text_y[0] = 0;
        text_x[1] = 25;
        text_y[1] = 225;
        text_x[2] = 25;
        text_y[2] = 125;
        text_x[3] = 875;
        text_y[3] = 225;
        text_x[4] = 875;
        text_y[4] = 125;

        player_score = 0;
        player_a = 0;
        player_b = 0;
        player_c = 0;
        player_d = 0;
        player_e = 0;
        player_limit_a = 10;
        player_limit_b = 10;
        player_limit_c = 10;
        player_limit_d = 10;
        player_limit_e = 10;

        SP_id = new int[5];
        SP_id[0] = 1;
        SP_id[1] = 6;
        SP_id[2] = 7;
        SP_id[3] = 49;
        SP_id[4] = 55;
        SP_a = new int[5];
        SP_a[0] = 1;
        SP_a[1] = 5;
        SP_a[2] = 0;
        SP_a[3] = 0;
        SP_a[4] = 5;
        SP_b = new int[5];
        SP_b[0] = 1;
        SP_b[1] = 0;
        SP_b[2] = 1;
        SP_b[3] = 2;
        SP_b[4] = 4;
        SP_c = new int[5];
        SP_c[0] = 1;
        SP_c[1] = 0;
        SP_c[2] = 2;
        SP_c[3] = 0;
        SP_c[4] = 3;
        SP_d = new int[5];
        SP_d[0] = 1;
        SP_d[1] = 0;
        SP_d[2] = 1;
        SP_d[3] = 2;
        SP_d[4] = 4;
        SP_e = new int[5];
        SP_e[0] = 1;
        SP_e[1] = 0;
        SP_e[2] = 0;
        SP_e[3] = 0;
        SP_e[4] = 5;
        SP_score = new int[5];
        SP_score[0] = 100;
        SP_score[1] = 100;
        SP_score[2] = 100;
        SP_score[3] = 100;
        SP_score[4] = 100;
    }
    
    /* Bat buoc */
    
    public void batDau() {
    	try {
            is = new FileOutputStream("ketqua.txt");
            osw = new OutputStreamWriter(is);
            w = new BufferedWriter(osw);
            w.write("[\n");
            w.close();
        } catch (Exception ex) {
            System.out.println("Loi!");
        } 
    }
    
    /* Di chuyen
     * 0: Den may 0
     * 1: Den may 1
     * 2: Den may 2
     * 3: Den may 3
     */

    public void goTo(int vt) {
        if ((vt < 0) || (vt > 3)) {
            vt = VT;
        }
        
        for (int i = 0; i < 22; ++i) {
        	int j = Math.min(20, i);
        	try {
				fw = new FileWriter("ketqua.txt",true);
				fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT] + (robot_x0[vt] - robot_x0[VT]) * j / 20, robot_y0[VT] + (robot_y0[vt] - robot_y0[VT]) * j / 20, robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0], SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	            fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Loi!");
			}
        }
        
        VT = vt;
    }
    
    /* Noi noi voi may
     * may = 0: ket noi voi may 0
     * 		id: id cua san pham de ket noi
     * may = 1: ket noi voi may 1
     * 		id: id cua nguyen lieu
     * 			0: red
     * 			1: orange
     * 			2: yellow
     * 			3: yellowgreen
     * 			4: lightblue
     * may = 2: ket noi voi may 2
     * 		id: id cua san pham de ket noi
     * may = 3: ket noi voi may 3
     * 		id: id cua nguyen lieu
     * 			0: red
     * 			1: orange
     * 			2: yellow
     * 			3: yellowgreen
     * 			4: lightblue
     * Tra ve:
     * -2: loi;
     * Con lai: khong loi;
     */
    
    public int ketNoi(int may, int id) {
    	if (may != layViTri()) {
    		goTo(layViTri());
			return - 2;
		}
    	
    	switch (may) {
    		case 0: {
    			if (layTrangThaiSanPham(id) == -1) {
    				int ID = layVTSanPhamByID(id);
    				SP[ID] = 0;
    				for (int i = 0; i < 22; ++i) {
    		        	int j = Math.min(20, i);
    		        	try {
    						fw = new FileWriter("ketqua.txt",true);
    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[1] + (brown_x0[2] - brown_x0[1]) * j / 20, brown_y0[1] + (brown_y0[2] - brown_y0[1]) * j / 20, brown_x, brown_y, "" + SP_id[ID], text_x[1] + (text_x[2] - text_x[1]) * j / 20, text_y[1] + (text_y[2] - text_y[1]) * j / 20, SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
    			            fw.close();
    					} catch (IOException e) {
    						// TODO Auto-generated catch block
    						System.out.println("Loi!");
    					}
    		        }
    			} else {
    				goTo(layViTri());
    			}
    			
    			return layTrangThaiSanPham(id);
    		}
    		
    		case 1: {
    	    	switch (id) {
    		    	case 0: {
    		    		if (SP_a[4] <= 0 || player_a >= player_limit_a) {
    		    			goTo(layViTri());
    		    			return -2;
    		    		}
    		    		
    		    		--SP_a[4];
    		    		++player_a;
    		    		
    		    		for (int i = 0; i < 22; ++i) {
        		        	int j = Math.min(20, i);
        		        	try {
        						fw = new FileWriter("ketqua.txt",true);
        						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[1] + (red_x0[2] - red_x0[1]) * j / 20, red_y0[1] + (red_y0[2] - red_y0[1]) * j / 20, red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
        			            fw.close();
        					} catch (IOException e) {
        						// TODO Auto-generated catch block
        						System.out.println("Loi!");
        					}
        		        }
    		    		
    		    		return 0;    		    		
    		    	}
    		        case 1: {
    		        	if (SP_b[4] <= 0 || player_b >= player_limit_b) {
    		        		goTo(layViTri());
    		    			return -2;
    		    		}
    		    		
    		    		--SP_b[4];
    		    		++player_b;
    		    		
    		    		for (int i = 0; i < 22; ++i) {
        		        	int j = Math.min(20, i);
        		        	try {
        						fw = new FileWriter("ketqua.txt",true);
        						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[1] + (orange_x0[2] - orange_x0[1]) * j / 20, orange_y0[1] + (orange_y0[2] - orange_y0[1]) * j / 20, orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
        			            fw.close();
        					} catch (IOException e) {
        						// TODO Auto-generated catch block
        						System.out.println("Loi!");
        					}
        		        }
    		    		
    		    		return 0;
    		        }
    		        case 2: {
    		        	if (SP_c[4] <= 0 || player_c >= player_limit_c) {
    		        		goTo(layViTri());
    		    			return -2;
    		    		}
    		    		
    		    		--SP_c[4];
    		    		++player_c;
    		    		
    		    		for (int i = 0; i < 22; ++i) {
        		        	int j = Math.min(20, i);
        		        	try {
        						fw = new FileWriter("ketqua.txt",true);
        						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[1] + (yellow_x0[2] - yellow_x0[1]) * j / 20, yellow_y0[1] + (yellow_y0[2] - yellow_y0[1]) * j / 20, yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
        			            fw.close();
        					} catch (IOException e) {
        						// TODO Auto-generated catch block
        						System.out.println("Loi!");
        					}
        		        }
    		    		
    		    		return 0;
    		        }
    		        case 3: {
    		        	if (SP_d[4] <= 0 || player_d >= player_limit_d) {
    		        		goTo(layViTri());
    		    			return -2;
    		    		}
    		    		
    		    		--SP_d[4];
    		    		++player_d;
    		    		
    		    		for (int i = 0; i < 22; ++i) {
        		        	int j = Math.min(20, i);
        		        	try {
        						fw = new FileWriter("ketqua.txt",true);
        						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[1] + (yellowgreen_x0[2] - yellowgreen_x0[1]) * j / 20, yellowgreen_y0[1] + (yellowgreen_y0[2] - yellowgreen_y0[1]) * j / 20, yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
        			            fw.close();
        					} catch (IOException e) {
        						// TODO Auto-generated catch block
        						System.out.println("Loi!");
        					}
        		        }
    		    		
    		    		return 0;
    		        }
    		        case 4: {
    		        	if (SP_e[4] <= 0 || player_e >= player_limit_e) {
    		        		goTo(layViTri());
    		    			return -2;
    		    		}
    		    		
    		    		--SP_e[4];
    		    		++player_e;
    		    		
    		    		for (int i = 0; i < 22; ++i) {
        		        	int j = Math.min(20, i);
        		        	try {
        						fw = new FileWriter("ketqua.txt",true);
        						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[1] + (lightblue_x0[2] - lightblue_x0[1]) * j / 20, lightblue_y0[1] + (lightblue_y0[2] - lightblue_y0[1]) * j / 20, lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
        			            fw.close();
        					} catch (IOException e) {
        						// TODO Auto-generated catch block
        						System.out.println("Loi!");
        					}
        		        }
    		    		
    		    		return 0;
    		        }
    		        default: {
    		        	goTo(layViTri());
    		        	return -2;
    		        }
    	    	}
    		}
    		case 2: {
    			if (layTrangThaiSanPham(id) == 0) {
    				int ID = layVTSanPhamByID(id);
    				if (player_a < SP_a[ID] || player_b < SP_b[ID] || player_c < SP_c[ID] || player_d < SP_d[ID] || player_e < SP_e[ID]) {
    					goTo(layViTri());
    					return -2;
    				}
    				
    				SP[ID] = 1;
    				player_score += SP_score[ID];
    				player_a -= SP_a[ID];
    				player_b -= SP_b[ID];
    				player_c -= SP_c[ID];
    				player_d -= SP_d[ID];
    				player_e -= SP_e[ID];
    				
    				for (int i = 0; i < 22; ++i) {
    		        	int j = Math.min(20, i);
    		        	try {
    						fw = new FileWriter("ketqua.txt",true);
    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[3] + (brown_x0[4] - brown_x0[3]) * j / 20, brown_y0[3] + (brown_y0[4] - brown_y0[3]) * j / 20, brown_x, brown_y, "" + SP_id[ID], text_x[3] + (text_x[4] - text_x[3]) * j / 20, text_y[3] + (text_y[4] - text_y[3]) * j / 20, SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
    			            fw.close();
    					} catch (IOException e) {
    						// TODO Auto-generated catch block
    						System.out.println("Loi!");
    					}
    		        }
    				
    				SP_id[ID] = -1;
    			} else {
    				goTo(layViTri());
    			}
    			
    			return layTrangThaiSanPham(id);
    		}
    		
    		case 3: {
	    			switch (id) {
			    	case 0: {
			    		if (player_a <= 0 || player_b >= player_limit_b) {
			    			goTo(layViTri());
			    			return -2;
			    		}
			    		
			    		--player_a;
			    		
			    		++player_b;
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[3] + (red_x0[4] - red_x0[3]) * i / 11, red_y0[3] + (red_y0[4] - red_y0[3]) * i / 11, red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[5] + (orange_x0[6] - orange_x0[5]) * i / 11, orange_y0[5] + (orange_y0[6] - orange_y0[5]) * i / 11, orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		return 0;    		    		
			    	}
			        case 1: {
			        	if (player_b <= 0 || player_c >= player_limit_c) {
			        		goTo(layViTri());
			    			return -2;
			    		}
			    		
			    		--player_b;
			    		++player_c;
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[3] + (orange_x0[4] - orange_x0[3]) * i / 11, orange_y0[3] + (orange_y0[4] - orange_y0[3]) * i / 11, orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[5] + (yellow_x0[6] - yellow_x0[5]) * i / 11, yellow_y0[5] + (yellow_y0[6] - yellow_y0[5]) * i / 11, yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		return 0;
			        }
			        case 2: {
			        	if (player_c <= 0 && player_d >= player_limit_d) {
			        		goTo(layViTri());
			    			return -2;
			    		}
			    		
			    		--player_c;
			    		++player_d;
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[3] + (yellow_x0[4] - yellow_x0[3]) * i / 11, yellow_y0[3] + (yellow_y0[4] - yellow_y0[3]) * i / 11, yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[5] + (yellowgreen_x0[6] - yellowgreen_x0[5]) * i / 11, yellowgreen_y0[5] + (yellowgreen_y0[6] - yellowgreen_y0[5]) * i / 11, yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		return 0;
			        }
			        case 3: {
			        	if (player_d <= 0 || player_e >= player_limit_e) {
			        		goTo(layViTri());
			    			return -2;
			    		}
			    		
			    		--player_d;
			    		++player_e;
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[3] + (yellowgreen_x0[4] - yellowgreen_x0[3]) * i / 11, yellowgreen_y0[3] + (yellowgreen_y0[4] - yellowgreen_y0[3]) * i / 11, yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[5] + (lightblue_x0[6] - lightblue_x0[5]) * i / 11, lightblue_y0[5] + (lightblue_y0[6] - lightblue_y0[5]) * i / 11, lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		return 0;
			        }
			        case 4: {
			        	if (player_e <= 0 || player_a >= player_limit_a) {
			        		goTo(layViTri());
			    			return -2;
			    		}
			    		
			    		--player_e;
			    		++player_a;
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[3] + (lightblue_x0[4] - lightblue_x0[3]) * i / 11, lightblue_y0[3] + (lightblue_y0[4] - lightblue_y0[3]) * i / 11, lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		for (int i = 0; i < 11; ++i) {
	    		        	try {
	    						fw = new FileWriter("ketqua.txt",true);
	    						fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, robot_x0[VT], robot_y0[VT], robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[5] + (red_x0[6] - red_x0[5]) * i / 11, red_y0[5] + (red_y0[6] - red_y0[5]) * i / 11, red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0] , SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
	    			            fw.close();
	    					} catch (IOException e) {
	    						// TODO Auto-generated catch block
	    						System.out.println("Loi!");
	    					}
	    		        }
			    		
			    		return 0;
			        }
			        default: {
			        	goTo(layViTri());
			        	return -2;
			        }
		    	}
    		}
    	}
    	
    	return -2;
    }
    
    /* Bat buoc */
    
    public void ketThuc() {
    	try {
			fw = new FileWriter("ketqua.txt",true);
			fw.write("\t" + setScence(machine_4_x0, machine_4_y0, machine_4_x, machine_4_y, 300, 150, robot_x, robot_y, machine_1_x0, machine_1_y0, machine_1_x, machine_1_y, machine_2_x0, machine_2_y0, machine_2_x, machine_2_y, machine_3_x0, machine_3_y0, machine_3_x, machine_3_y, red_x0[0], red_y0[0], red_x, red_y, orange_x0[0], orange_y0[0], orange_x, orange_y, yellow_x0[0], yellow_y0[0], yellow_x, yellow_y, yellowgreen_x0[0], yellowgreen_y0[0], yellowgreen_x, yellowgreen_y, lightblue_x0[0], lightblue_y0[0], lightblue_x, lightblue_y, brown_x0[0], brown_y0[0], brown_x, brown_y, "" + SP_id[0], text_x[0], text_y[0], SP_id[0], SP_a[0], SP_b[0], SP_c[0], SP_d[0], SP_e[0], SP_id[1], SP_a[1], SP_b[1], SP_c[1], SP_d[1], SP_e[1], SP_id[2], SP_a[2], SP_b[2], SP_c[2], SP_d[2], SP_e[2], SP_id[3], SP_a[3], SP_b[3], SP_c[3], SP_d[3], SP_e[3], SP_a[4], SP_b[4], SP_c[4], SP_d[4], SP_e[4], player_score, player_a, player_b, player_c, player_d, player_e) + "\n");
			fw.write("\t{}\n]");
	        fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Loi!");
		}
        
    }

}