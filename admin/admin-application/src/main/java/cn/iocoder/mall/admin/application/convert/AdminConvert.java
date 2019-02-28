package cn.iocoder.mall.admin.application.convert;

import cn.iocoder.mall.admin.sdk.context.AdminSecurityContext;
import cn.iocoder.mall.admin.application.vo.AdminInfoVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdminConvert {

    AdminConvert INSTANCE = Mappers.getMapper(AdminConvert.class);

    @Mappings({})
    AdminInfoVO convert(AdminSecurityContext adminSecurityContext);

}