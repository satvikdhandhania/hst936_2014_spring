package org.moca.activity;
import org.moca.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Causes extends Activity {
	 String diseaseName;
	  String[] cmd,sym1,sym2,sym3,sym4;
	  Integer i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.symptoms);
		
		
		cmd = getResources().getStringArray(R.array.Diseases);
		sym1 = getResources().getStringArray(R.array.Cau1);
		sym2 = getResources().getStringArray(R.array.Cau2);
		sym3 = getResources().getStringArray(R.array.Cau3);
		sym4 = getResources().getStringArray(R.array.Cau4);
		Intent intent = getIntent();
		diseaseName = intent.getExtras().getString("name");
		TextView tv1=(TextView)findViewById(R.id.tvSymHead);
		ImageView iv1=(ImageView)findViewById(R.id.ivSym);
		
		int[] images = new int[16];
		images[0] = R.drawable.m_ecz_cau;
		images[1] = R.drawable.m_fwa_cau;
		images[2] = R.drawable.m_hsi_cau;
		images[3] = R.drawable.m_hzo_cau;
		images[4] = R.drawable.m_imp_cau;
		images[5] = R.drawable.m_ibi_cau;
		images[6] = R.drawable.m_ony_cau;
		images[7] = R.drawable.m_pso_cau;
		images[8] = R.drawable.m_pal_cau;
		images[9] = R.drawable.m_sca_cau;
		images[10] = R.drawable.m_tca_cau;
		images[11] = R.drawable.m_tco_cau;
		images[12] = R.drawable.m_tfa_cau;
		images[13] = R.drawable.m_tpe_cau;
		images[14] = R.drawable.m_vit_cau;
		images[15] = R.drawable.m_war_cau;
		
		TextView tv2=(TextView)findViewById(R.id.tvSymName);
		TextView tv3=(TextView)findViewById(R.id.tvSymData);
		TextView tv4=(TextView)findViewById(R.id.tvsym2);
		TextView tv5=(TextView)findViewById(R.id.tvsym3);
		TextView tv6=(TextView)findViewById(R.id.tvsym4);
		for(i=0;i<cmd.length;i++)
		{
		if(diseaseName.contentEquals(cmd[i]))
		{
			tv1.setText(cmd[i]);
			iv1.setImageResource(images[i]);
			tv2.setText("Causes");
			tv3.setText(sym1[i]);
			tv4.setText(sym2[i]);
			tv5.setText(sym3[i]);
			tv6.setText(sym4[i]);
		}
		}
	
	}

	public Causes() {
		// TODO Auto-generated constructor stub
	}

}