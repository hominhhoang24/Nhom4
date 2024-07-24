import java.util.List;

/**
 * Đại diện cho một đội các robot.
 */
public class Team {
    private String teamName;
    private List<Robot> robots;

    /**
     * Tạo một đối tượng Team mới với tên đội và danh sách các robot được chỉ định.
     *
     * @param teamName tên của đội.
     * @param robots danh sách các robot trong đội.
     */
    public Team(String teamName, List<Robot> robots) {
        this.teamName = teamName;
        this.robots = robots;
    }

    /**
     * Trả về tên của đội.
     *
     * @return tên đội.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Trả về danh sách các robot trong đội.
     *
     * @return danh sách các robot.
     */
    public List<Robot> getRobots() {
        return robots;
    }
}
