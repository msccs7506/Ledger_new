package cs.hku.ledger.frag_record;
import cs.hku.ledger.R;
import cs.hku.ledger.db.DBManager;
import cs.hku.ledger.db.TypeBean;
import java.util.List;
/**
 * 收入记录页面
 */
public class IncomeFragment extends BaseRecordFragment {


    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        //获取数据库当中的数据源
        List<TypeBean> inlist = DBManager.getTypeList(1);
        typeList.addAll(inlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("Salary");
        typeIv.setImageResource(R.mipmap.in_xinzi_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(1);
        DBManager.insertItemToAccounttb(accountBean);
    }
}
