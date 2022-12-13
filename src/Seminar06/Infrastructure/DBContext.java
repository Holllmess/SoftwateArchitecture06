package Seminar06.Infrastructure;

public abstract class DBContext {
    protected Database database;
    protected abstract void onModelCreating(ModelBuilder builder);

    public DBContext(Database database) {
        this.database = database;
    }

    public boolean saveChanges(){
        //TODO: Saving changes to the database..
        return true;
    }
}

class ModelBuilder{

    public ModelBuilder applyConfiguration(ModelConfiguration configuration){
        //TODO: добавление конфигурации мапинга объекта некотого типа к структуре таблицы базы данных..
        return this;
    }
}
