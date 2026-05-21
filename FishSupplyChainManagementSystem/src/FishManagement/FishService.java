
package FishManagement;

import java.util.List;

public class FishService
{
    FishDAO dao = new FishDAO();

    public List<String> getFishIds() throws Exception {
        return dao.getFishIds();
    }

    public List<String> getFishNames() throws Exception {
        return dao.getFishNames();
    }

    public void addFish(FishModel m) throws Exception {
        dao.insertFish(m);
    }

    public void updateFish(FishModel m) throws Exception {
        dao.updateFish(m);
    }

    public void deleteFish(String id) throws Exception {
        dao.deleteFish(id);
    }

    public List<FishModel> getAllFish() throws Exception {
        return dao.getFishData();
    }
}
