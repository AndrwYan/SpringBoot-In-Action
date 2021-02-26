package com.andrew.mapper;

import com.andrew.domain.GoodInfoBean;
import com.andrew.domain.GoodTypeBean;
import com.andrew.dto.GoodInfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
/**
 *
 * @Mapper注解是用于标注接口、抽象类是被MapStruct自动映射的标识
 * 只有存在该注解才会将内部的接口方法自动实现
 *
 * Spring方式我们需要在@Mapper注解内添加componentModel属性值，
 * 配置后在外部可以采用@Autowired方式注入Mapper实现类完成映射方法调用。
 *
 */
public interface GoodInfoMapper{
    @Mappings({


            /**
             *
             * 在Mapper接口定义方法上面声明了一系列的注解映射@Mapping以及@Mappings，那么这两个注解是用来干什么工作的呢？
             * @Mapping注解我们用到了两个属性，分别是source、target
             *
             * source代表的是映射接口方法内的参数名称，如果是基本类型的参数，参数名可以直接作为source的内容，如果是实体类型，则可以采用实体参数名.字段名的方式作为source的内容，配置如上面GoodInfoMapper内容所示。
             *
             * target代表的是映射到方法方法值内的字段名称，配置如上面GoodInfoMapper所示
             *
             * 作者：恒宇少年
             * 链接：https://www.jianshu.com/p/3f20ca1a93b0
             * 来源：简书
             * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
             *
             *
             */
            @Mapping(source = "type.name",target = "typeName"),
            @Mapping(source = "good.id",target = "goodId"),
            @Mapping(source = "good.title",target = "goodName"),
            @Mapping(source = "good.price",target = "goodPrice")})
    public GoodInfoDto from(GoodInfoBean good, GoodTypeBean type);

}
