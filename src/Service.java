//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Service {
    private RepoDbProdus repo;

    public Service(RepoDbProdus repo) {
        this.repo = repo;
    }

    public Iterable<Produs> getAll() {
        return this.repo.findAll();
    }
}
