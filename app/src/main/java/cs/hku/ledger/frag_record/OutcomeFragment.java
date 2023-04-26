package cs.hku.ledger.frag_record;
import androidx.fragment.app.Fragment;
import cs.hku.ledger.R;
import cs.hku.ledger.db.DBManager;
import cs.hku.ledger.db.TypeBean;
import java.util.List;
/**
 * A simple {@link Fragment} subclass.
 */
public class OutcomeFragment extends BaseRecordFragment {

    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        List<TypeBean> outlist = DBManager.getTypeList(0);
        typeList.addAll(outlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("Dining");
        typeIv.setImageResource(R.mipmap.ic_canyin_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(0);
        DBManager.insertItemToAccounttb(accountBean);
    }
}
