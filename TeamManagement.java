import java.util.ArrayList;
import java.util.List;

/**
 * Quản lý một tập hợp các đội robot.
 */
public class TeamManagement {
    private List<Team> teams;

    /**
     * Tạo một đối tượng TeamManagement mới với danh sách đội trống.
     */
    public TeamManagement() {
        this.teams = new ArrayList<>();
    }

    /**
     * Thêm một đội vào hệ thống quản lý.
     *
     * @param team đội cần được thêm vào.
     */
    public void addTeam(Team team) {
        teams.add(team);
    }

    /**
     * Trả về danh sách các đội trong hệ thống quản lý.
     *
     * @return danh sách các đội.
     */
    public List<Team> getTeams() {
        return teams;
    }
}
