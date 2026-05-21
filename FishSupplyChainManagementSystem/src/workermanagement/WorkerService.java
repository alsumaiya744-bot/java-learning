
package workermanagement;

import java.util.List;

public class WorkerService
{
    
        WorkerDAO dao = new WorkerDAO();

    public String generateWorkerId() throws Exception {
        return dao.generateNextWorkerId();
    }

    public void registerWorker(WorkerModel m) throws Exception {
        dao.insertWorker(m);
    }

    public void updateWorker(WorkerModel m) throws Exception {
        dao.updateWorker(m);
    }

    public void deleteWorker(String id) throws Exception {
        dao.deleteWorker(id);
    }

    public void markAttendance(String id) throws Exception {
        dao.markAttendance(id);
    }

    public List<WorkerModel> getWorkers() throws Exception {
        return dao.getWorkers();
    }

    public List<String> getWorkerIds() throws Exception {
        return dao.getWorkerIds();
    }
    
}
