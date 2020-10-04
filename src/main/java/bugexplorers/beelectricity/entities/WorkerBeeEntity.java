package bugexplorers.beelectricity.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.world.World;

public class WorkerBeeEntity extends BeeEntity {

    public WorkerBeeEntity(EntityType<? extends WorkerBeeEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {

    }
}
